/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/MessageDrivenBean.java to edit this template
 */
package ejb;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

/**
 *
 * @author root
 */
@MessageDriven(mappedName = "jms/itqueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class ActiveBean implements MessageListener {
    
    public ActiveBean() {
    }
    
    @Override
    public void onMessage(Message message) {
        
        try {
            System.out.println(((TextMessage)message).getText());
        } catch (JMSException ex) {
            Logger.getLogger(ActiveBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try{
                
                Properties p = new Properties();
                p.setProperty(Context.PROVIDER_URL, "mq://localhost:7676");
                
                //====  Queue ========================================
                
                InitialContext ic = new InitialContext(p);
                Queue queue = (Queue) ic.lookup("jms/ictqueue");
                ConnectionFactory cf = (ConnectionFactory) ic.lookup("jms/ictqueueFactory");
                Connection con = cf.createConnection();
                Session session = con.createSession();
                MessageProducer mp = session.createProducer(queue);
                TextMessage tm = session.createTextMessage("I am a queue  message");
                mp.send(tm);
        }
        catch(Exception e)
        {
            
        }
    }
    
}
