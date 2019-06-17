/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oreilly.servlet.MultipartRequest;
/**
 *
 * @author Ferhat Yacine
 */
public class Servlet1 extends HttpServlet {

    protected void doPost(HttpServletRequest r, HttpServletResponse s) throws IOException, ServletException{
        MultipartRequest m= new MultipartRequest (r,"F:");
        PrintWriter p= s.getWriter();
        p.print(m.getParameter("file"));
    }
}
