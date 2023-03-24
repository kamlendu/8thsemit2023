/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author root
 */
@Named(value = "users")
@SessionScoped
public class Users implements Serializable {

    String person;
    String valuemessage;
    String actionmessage;
    Collection<String> names;
   
    /**
     * Creates a new instance of Users
     */
    public Users() {
        names = new ArrayList<>();
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Priya");
        names.add("Vivek");
        
        
    }

    public Collection<String> getNames() {
        return names;
    }

    public void setNames(Collection<String> names) {
        this.names = names;
    }
    
    
    public void handleAction(ActionEvent evt)
    {
        actionmessage="The Action Listener was  called by clicking the button";
    }
    
    public void valueChange(ValueChangeEvent evt)
    {
        valuemessage="The value change listener was called with old value = "
                + evt.getOldValue() + " and New Value = "+ evt.getNewValue();
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getValuemessage() {
        return valuemessage;
    }

    public void setValuemessage(String valuemessage) {
        this.valuemessage = valuemessage;
    }

    public String getActionmessage() {
        return actionmessage;
    }

    public void setActionmessage(String actionmessage) {
        this.actionmessage = actionmessage;
    }
    
    
    
    
    
}
