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
    protected void doGet(HttpServletRequest r, HttpServletResponse s) throws IOException, ServletException{
        int n1= Integer.parseInt(r.getParameter("n1"));
        int n2= Integer.parseInt(r.getParameter("n2"));
        int res = n1+n2;
        r.setAttribute("c",res);
        
        RequestDispatcher rd;
        rd = r.getRequestDispatcher("index.jsp");
        rd.forward(r, s);
       
    }
}
