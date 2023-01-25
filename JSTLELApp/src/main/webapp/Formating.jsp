<%-- 
    Document   : Formating
    Created on : 25-Jan-2023, 12:09:56 PM
    Author     : root
--%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           request.setAttribute("curdate", new java.util.Date());

            %>
        <h3>
            <fmt:setLocale value="hi_IN"/>
            <fmt:setBundle var="lbl" basename="labels"/>
         <br/>   <fmt:message key="welcome" bundle="${lbl}"/>
            <hr/>
            <br/>
            
            <fmt:setLocale value="en"/> 
            <c:set var="now" value="${curdate}"/>  
            ${now}
          <br/>  <fmt:formatDate type="both" value="${now}"/>
           <br/>  <fmt:formatDate type="time" value="${now}"/>
           <br/>  <fmt:formatDate type="date" value="${now}"/>
           <br/>  <fmt:formatDate pattern="dd-MM-YYYY"  value="${now}"/>
           
           <c:set var="num" value="23546.12532"/>
         <hr/>  
        <br/>   <fmt:formatNumber maxFractionDigits="2" value="${num}"/>
        <br/>   <fmt:formatNumber maxIntegerDigits="3" value="${num}"/>
        <br/>   <fmt:formatNumber pattern="##,###.#" value="${num}"/>
        <br/>   <fmt:formatNumber type="currency" currencySymbol="$" value="${num}"/>
        
            
            
            
            
            
            
            
            
            
            
            
        </h3>
    </body>
</html>
