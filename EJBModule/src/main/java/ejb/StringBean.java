/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author root
 */
@Stateless(mappedName = "ejb/str1")
public class StringBean implements StringBeanRemote {

    @EJB MathBeanLocal mbl;
    
    @Override
    public String concatenate(String str1, String str2) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    return str1+" "+ str2;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public int sum(int x, int y) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
      return mbl.add(x, y);
    }



}
