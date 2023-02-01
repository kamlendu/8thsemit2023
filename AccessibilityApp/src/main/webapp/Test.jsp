<%-- 
    Document   : Test
    Created on : 01-Feb-2023, 11:57:09 AM
    Author     : root
--%>

<%@page contentType="text/html" import="ejb.*, javax.naming.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!     
        StringBeanRemote sbr = null;
        MathBeanLocal mbl = null;
        
public void jspInit()
{

try{

InitialContext ic = new InitialContext();

sbr = (StringBeanRemote) ic.lookup("ejb/str");

mbl = (MathBeanLocal) ic.lookup("java:module/MathBean");



}
catch(Exception e)
{

}
}

public void jspDestroy()
{
sbr=null;
mbl=null;
}
        
        
        %>
        
        <h1>
            
            The concat of MSc and IT is <%=sbr.concatenate("MSc", "IT")%><br/>
            The sum of 50 and 80 is <%= mbl.add(50, 80)%>
                             
            
            
            
            
        </h1>
    </body>
</html>
