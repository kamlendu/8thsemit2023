/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package beans;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author root
 */
@Named(value = "user")
@SessionScoped
public class User implements Serializable {
    
    String username;
    String person;
    String password;
    String message;
    String message1;
    Collection<String> names;

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Collection<String> getNames() {
        return names;
    }

    public void setNames(Collection<String> names) {
        this.names = names;
    }

    public String getMessage1() {
        return message1;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }
    

    
    public void handle(ValueChangeEvent evt)
    {
        
       this.message="Old Value "+ evt.getOldValue() + " New Value = "+evt.getNewValue();
       ;
    }
    public void handles(ActionEvent evt)
    {
        
       this.message1=" The message is handled by action event ";
       
    }
    
    public String getUsername() {
        return username;
    }

    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String login()
    {
        return "result.jsf";
    }
    /**
     * Creates a new instance of User
     */
    public User() {
        names = new ArrayList<>();
        names.add("Suresh");
        names.add("Lokesh");
        names.add("Prathmesh");
        
    }
    
}
