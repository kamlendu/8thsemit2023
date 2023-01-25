
import java.util.Hashtable;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/ServletListener.java to edit this template
 */

/**
 * Web application lifecycle listener.
 *
 * @author root
 */
public class AppListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        
        int[] intArray = new int[] {10, 20, 30, 40, 50};
        sce.getServletContext().setAttribute("intArray", intArray);

	/**
	 * Array of Objects (String)
	 */
	String[] stringArray = new String[] {
	    "A first string",
	    "Second String",
	    "Third String",
	};
        sce.getServletContext().setAttribute("stringArray", stringArray);

	/**
        * String-keyed Map
        */
        Hashtable stringMap = new Hashtable();
        stringMap.put("one", "uno");
        stringMap.put("two", "dos");
        stringMap.put("three", "tres");
        stringMap.put("four", "cuatro");
        stringMap.put("five", "cinco");
        stringMap.put("six", "seis");
        stringMap.put("seven", "siete");
        stringMap.put("eight", "ocho");
        stringMap.put("nine", "nueve");
        stringMap.put("ten", "diez");
      sce.getServletContext().setAttribute("stringMap", stringMap);
      
        
        
        
        
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
