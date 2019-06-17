import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            PrintWriter p=response.getWriter();
            
            p.print("<!DOCTYPE html><html><head><title>Servlet servlet1</title>");
            p.print("</head><body>");
            
            
            String num1=request.getParameter("n1");
            String num2=request.getParameter("n2");
            String op=request.getParameter("op");
            
            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);
            int resultat=0;
            
            
            switch(op){
                case "+":
                    resultat = number1+number2;
                    break;
                case "/":
                    resultat = number1/number2;
                    break;
                case "*":
                    resultat = number1*number2;
                    break;
                case "-":
                    resultat = number1-number2;
                    break;
                
                default: 
                     out.println("rak ghalet !");
            }
            
            p.print("<p>"+resultat+"<p>");
            p.print("</body></html>");
            
        
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
