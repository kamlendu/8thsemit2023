/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;

/**
 *
 * @author root
 */
@DeclareRoles({"Admin","Supervisor"})
@Stateless
public class HelloBean implements HelloBeanLocal {

   
    @RolesAllowed("Admin")
    //@PermitAll
    //@DenyAll
    @Override
    public String sayHello() {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    
    return " A Secure Hello from EJB !!";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")



}
