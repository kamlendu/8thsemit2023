/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.SlideEndEvent;

/**
 *
 * @author root
 */
@Named(value = "sliderBean")
@RequestScoped
public class SliderBean {

     private int number1;  
      
    private int number2;  
      
    private int number3;  
      
    private int number4;  
  
    private int number5;  
  
    public int getNumber1() {  
        return number1;  
    }  
  
    public void setNumber1(int number1) {  
        this.number1 = number1;  
    }  
  
    public int getNumber2() {  
        return number2;  
    }  
  
    public void setNumber2(int number2) {  
        this.number2 = number2;  
    }  
  
    public int getNumber3() {  
        return number3;  
    }  
  
    public void setNumber3(int number3) {  
        this.number3 = number3;  
    }  
  
    public int getNumber4() {  
        return number4;  
    }  
  
    public void setNumber4(int number4) {  
        this.number4 = number4;  
    }  
  
    public int getNumber5() {  
        return number5;  
    }  
  
    public void setNumber5(int number5) {  
        this.number5 = number5;  
    }  
  
    public void onSlideEnd(SlideEndEvent event) {  
        FacesMessage msg = new FacesMessage("Slide Ended", "Value: " + event.getValue());  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
}
