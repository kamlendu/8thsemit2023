<%-- 
    Document   : Scopes.jsp
    Created on : 24-Jan-2023, 12:15:32 PM
    Author     : root
--%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>
            
            <%
                session.setAttribute("username", "abcdefg");
                application.setAttribute("username", "sunil shah");

                %>
            
            <c:forEach var="str" items="${stringArray}">
              
                ${str} <br/>
                
            </c:forEach> 
            
                <br> ${sessionScope.username}
                 <br> ${applicationScope.username}
            
            
            
        </h3>
    </body>
</html>
