/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package ejb;

import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.AccessTimeout;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.DependsOn;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.transaction.UserTransaction;

/**
 *
 * @author root
 */
@TransactionManagement(TransactionManagementType.BEAN)
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
@AccessTimeout(value = 30, unit = TimeUnit.SECONDS)
@Startup
@Singleton
@DependsOn({"FirstBean", "SecondBean"})
public class SingleBean {
    
    @Resource UserTransaction utx;
    
    String firstName;
    String lastName;
    
    

    public SingleBean() {
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PostConstruct
    public void initialize()
    {
       firstName="";
       lastName ="";
       
       System.out.println("Single Bean is instantiated");
    }

    @Lock(LockType.READ)
    public String getFirstName() {
        return firstName;
    }

     @Lock(LockType.WRITE)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

     @Lock(LockType.READ)
    public String getLastName() {
        return lastName;
    }

     @Lock(LockType.WRITE)
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

public String getFullName(String firstName, String lastName)
{
    this.firstName=firstName;
    this.lastName=lastName;
    String fullName="";
    try{
    
        utx.begin();
     fullName = this.firstName+ " "+ this.lastName;
        utx.commit();
    }
    catch(Exception tx)
    {
        
        try {
            utx.setRollbackOnly();
            
            
            tx.printStackTrace();
        } catch (Exception transact) {
            
            transact.printStackTrace();
        } 
    }
    
    return fullName;
}


}
