<%-- 
    Document   : index
    Created on : 17 juin 2019, 09:03:14
    Author     : Ferhat Yacine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method ="get" action="Servlet1">
            <input type="text" name="n1">
            <input type="text" name="n2">
            <input type="submit">
        </form>
        <%
            Object c = request.getAttribute("c");
            if(c!=null){
            out.print(c);     
            }
           
           %>


    </body>
</html>
