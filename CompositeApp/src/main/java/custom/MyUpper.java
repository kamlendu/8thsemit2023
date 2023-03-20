/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/FacesComponent.java to edit this template
 */
package custom;

import java.io.IOException;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

/**
 *
 * @author root
 */
@FacesComponent(createTag = true, tagName = "myupper", namespace = "http://example.com/tags")
public class MyUpper extends UIComponentBase {
    
    @Override
    public String getFamily() {
        return "custom";
    }

    @Override
    public void encodeBegin(FacesContext context) throws IOException {
        super.encodeBegin(context); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    
        String val = (String) getAttributes().get("val");
        
        if (val != null) {
            ResponseWriter responseWriter = context.getResponseWriter();
            responseWriter.write(val.toUpperCase());
        }
    
    
    }
    
    
    
}
