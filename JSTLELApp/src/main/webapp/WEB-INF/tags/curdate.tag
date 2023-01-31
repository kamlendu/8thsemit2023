<%-- 
    Document   : curdate
    Created on : 27-Jan-2023, 11:03:36 AM
    Author     : root
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="message"%>

<%-- any content can be specified here e.g.: --%>
<h2><%= new java.util.Date().toString()%></h2>