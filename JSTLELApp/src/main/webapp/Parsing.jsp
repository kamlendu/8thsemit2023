<%-- 
    Document   : Parsing
    Created on : 25-Jan-2023, 11:53:11 AM
    Author     : root
--%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>
            <!-- Load the XML file -->
            
            <c:import var="doc" url="/book.xml"/>
            
            <x:parse var="parsedoc" doc="${doc}"/>
            
            
            <x:out select="$parsedoc//details/publishername"/>
            
            <hr/>
            <x:forEach select="$parsedoc//details">
                
               <br/> <x:out select="bookname"/>
                <br/> <x:out select="synopsis"/>
                 <br/> <x:out select="authorname"/>
                  <br/> <x:out select="publishername"/>
                  <hr/>
            </x:forEach>
            
            
            
            
            
        </h3>
        
        
        
        
        
    </body>
</html>
