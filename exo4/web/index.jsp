<%-- 
    Document   : index
    Created on : 11 juin 2019, 18:57:27
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
        <h1>Hello!</h1>
        <p>Please pick a background color ! </p>
        <form action="http://localhost:8080/exo4/servlet1" method="get">
            <input type="text" name="color">
            <input type="submit">
        </form>
    </body>
</html>
