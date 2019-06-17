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
        String pwd = r.getParameter("psw");
        String u = getServletConfig().getInitParameter("u");
        
        String p = getServletConfig().getInitParameter("p");
        
        
        if(user.equals("admin") && pwd.equals("psw")){
            RequestDispatcher rd = r.getRequestDispatcher("Bienvenu.jsp");
            rd.forward(r,s);
        }
        else {
            RequestDispatcher rd = r.getRequestDispatcher("index.jsp");
            rd.include(r,s);
            PrintWriter print = s.getWriter();
            print.print("<html><body><script>alert('Vous vous êtes trompés !')</script></body></html>");
        }
        /*
        
        if(user.equals("admin") && pwd.equals("psw")){
            s.sendRedirect("Bienvenu.jsp");  
        }
        else {
            s.sendRedirect("index.jsp");
        }*/
    }
   
}
