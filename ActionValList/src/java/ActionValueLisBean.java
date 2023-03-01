

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

@RequestScoped
@Named
public class ActionValueLisBean {

    private List<String> fruitsList;
    private String currSel;
    private String prevSel;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
  
    public String getCurrSel() {
        return currSel;
    }

    public void setCurrSel(String currSel) {
        this.currSel = currSel;
    }

    public String getPrevSel() {
        return prevSel;
    }

    public void setPrevSel(String prevSel) {
        this.prevSel = prevSel;
    }

   

    public List<String> getFruitsList() {
        return fruitsList;
    }

    public void setFruitsList(List<String> fruitsList) {
        this.fruitsList = fruitsList;
    }

   

    public ActionValueLisBean() {
        fruitsList = new ArrayList<String>(5);
        
        fruitsList.add("Apple");
        fruitsList.add("Mango");
        fruitsList.add("Banana");
        fruitsList.add("Peach");
        fruitsList.add("Plum");

    }



    public void processCommandButton(ActionEvent event){
        //using Swing just for demo purpose..minimize Netbeans and you will see MessageDialog..
        //JOptionPane.showMessageDialog(null ,"I am Handled by an Action Listener");
        msg ="I am Handled by an Action Listener";
    }

    public void processValueChange(ValueChangeEvent event)  {

        if (event.getOldValue() != null) {
            prevSel = event.getOldValue().toString();
        }

        if (event.getNewValue() != null) {
            currSel = event.getNewValue().toString();
        }

    }

}
