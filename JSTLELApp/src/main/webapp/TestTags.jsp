<%-- 
    Document   : TestTags
    Created on : 27-Jan-2023, 11:05:05 AM
    Author     : root
--%>
<%@taglib  uri="/WEB-INF/tlds/mytags" prefix="mytags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <mytags:curdate/>
            
            <br/>
            
            <mytags:upper>hello</mytags:upper>
             <br/>
            <mytags:changecase ccase="lower"> WORLD </mytags:changecase>
            
        </h1>
    </body>
</html>
