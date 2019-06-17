<%-- 
    Document   : index
    Created on : 11 juin 2019, 20:05:22
    Author     : Ferhat Yacine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.4/css/bulma.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="hero">
            <div class="hero-body">
                    <div class="container">
                            <div class="columns is-centered">
                                    <div class="column is-half">
                                            <div class="box">
                                                    <h1 class="title is-2 has-text-centered">
                                                            Authentification
                                                    </h1>	
                                                    <form action="Servlet1" method="post">
                                                        <div class="field">
                                                        <label class="label">UserName</label>
                                                        <div class="control">
                                                          <input class="input" name="username" type="text" placeholder="UserName">
                                                        </div>
                                                      </div>
                                                    <div class="field">
                                                        <p class="control ">
                                                            <label class="label">PassWord</label>
                                                            <input class="input" name="password" type="password" placeholder="Password">
                                                         
                                                        </p>
                                                      </div>
                                                        <br>
                                                        <div class="field is-grouped is-grouped-centered">
                                                        <p class="control">
                                                            
                                                            <input type="submit" class="button is-primary">
                                                        </p>
                                                      </div>
                                                    </form>
                                            </div>
                                    </div>
                            </div>
                    </div>
            </div>
        </div>
        
        <%
              Object c = request.getAttribute("erreur");
              
              if(c!=null){
                out.print("<script>alert('Vous vous êtes trompés !')</script>");
              }
            %>
    </body>
</html>


