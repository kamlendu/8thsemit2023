
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/ServletListener.java to edit this template
 */

/**
 * Web application lifecycle listener.
 *
 * @author root
 */
public class MyListener implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        
        System.out.println("Application is deployed ....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
         System.out.println("Application is undeployed ....");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        
         System.out.println("Application attribute added with name " + event.getName()+ " and value = "+ event.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
           System.out.println("Application attribute removed with name " + event.getName()+ " and value = "+ event.getValue());
 
    
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        
        HttpSession session = se.getSession();
        session.setAttribute("role", "Guest");
     System.out.println("Session Created ....");
 
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
           System.out.println("Session Destroyed ....");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        
               System.out.println("Session attribute added with name " + event.getName()+ " and value = "+ event.getValue());
  
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
    
           System.out.println("Session attribute removed with name " + event.getName()+ " and value = "+ event.getValue());
  
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
    }
}
