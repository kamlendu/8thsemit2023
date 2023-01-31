/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejb;

import javax.ejb.Remote;

/**
 *
 * @author root
 */
@Remote
public interface StringBeanRemote {
    
    String concatenate(String str1, String str2);
    
}
