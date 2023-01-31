<%-- 
    Document   : upper
    Created on : 27-Jan-2023, 11:08:34 AM
    Author     : root
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="message"%>
<jsp:doBody var="content"/>

<%-- any content can be specified here e.g.: --%>
<h2>
    <%
    String text = (String) jspContext.getAttribute("content");
    
    out.println(text.trim().toUpperCase());
    
    
    %>
</h2>