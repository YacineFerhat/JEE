/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ferhat Yacine
 */
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest r, HttpServletResponse s) throws IOException, ServletException{
        String user = r.getParameter("username");
        String pass = r.getParameter("password");
       // String u = getServletConfig().getInitParameter("u");
       // String p = getServletConfig().getInitParameter("p");
        
         if(user.equals("admin") && pass.equals("pass")){
            RequestDispatcher rd = r.getRequestDispatcher("Bienvenu.jsp");
            rd.forward(r,s);
        }
         else {
             String erreur = "Vous vous êtes trompés =) ";
             r.setAttribute("erreur", erreur);
             RequestDispatcher rd = r.getRequestDispatcher("index.jsp");
             rd.forward(r, s);
         }
    }
}
