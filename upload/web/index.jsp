<%-- 
    Document   : index
    Created on : 17 juin 2019, 09:43:09
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
        <form method="POST" 
              enctype="multipart/form-data" 
              action="${pageContext.request.contextPath}/Servlet1">
            <input type="file" name="file">
            <input type="submit">            
        </form>
    </body>
</html>
