<%-- 
    Document   : jstl
    Created on : 24-Jan-2023, 11:55:33 AM
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
            
            <c:forEach var="val" items="${paramValues.c}">
                <br/> ${val}
            </c:forEach>
            
            
             <c:set var="x" value="${param.a}"/>
            <c:set var="y" value="${param.b}"/>
            
            <c:if var="b" test="${x < 10}">
          <br/>     X is less than 10 
            </c:if>
               <c:if test="${x > 10}">
            <br/>   X is more than 10 
            </c:if>
            
           <br/> 
           
           <c:choose>
               <c:when test="${x > 10}">
                  Choose : X is more than 10
               </c:when>
               <c:when test="${x < 10}">
                 Choose :  X is less than 10
               </c:when>
               <c:otherwise>
                       
              Choose :  X is equal to 10
              </c:otherwise>     
               
               
               
           </c:choose>  
           
           
            
           <br/>
            
            <c:out value="Hello World of JSTL-EL"/> 
         <br/>   <c:out value="The sum of 40 and 50 is ${40+50}"/> 
        
         <br/>   <c:out value="The sum of ${x} and ${y} is ${x+y}"/> 
         
         <c:forEach var="i" begin="1" end="10" step="1">
             <br> <c:out value="The square of ${i} is ${i*i}"/>
         </c:forEach>
             
             <c:forEach var="h" items="${header}">
               <br>   <c:out value="${h}"/>
             </c:forEach>
         
            
           
            
            
        </h3>
    </body>
</html>
