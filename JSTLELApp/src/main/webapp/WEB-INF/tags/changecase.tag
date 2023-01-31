<%-- 
    Document   : changecase
    Created on : 27-Jan-2023, 11:15:21 AM
    Author     : root
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="ccase"%>
<jsp:doBody var="content"/>
<%-- any content can be specified here e.g.: --%>
<h2>
    
     <%
    String text = (String) jspContext.getAttribute("content");
    String attr = (String) jspContext.getAttribute("ccase");
    
    if(ccase.equalsIgnoreCase("upper"))
    out.println(text.trim().toUpperCase());
    else if(ccase.equalsIgnoreCase("lower"))
     out.println(text.trim().toLowerCase());
    else
     out.println("There is some error in attribute (lower/upper)");
    
    
    %>
    
    
</h2>