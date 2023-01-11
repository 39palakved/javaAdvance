
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class TextProcessor extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
           
        // step1 read the request data to sever
        String s1 = request.getParameter("t1");
        String s2 = request.getParameter("t2");
        String s[] =request.getParameterValues("t3");
        String s3 = request.getParameter("c1");
        String s4 = request.getParameter("r1");
        
        //step 2 process the data 
        int tax =0;
        int income = Integer.parseInt(s1);
        int age = Integer.parseInt(s2);
        if(income>=500000){
            tax=income*20/100;
        }
        else if(income>=300000){
            tax = income*10/100;
        }
        if(age>=60){
            tax = tax-(tax*10/100);
        }
        int srch=0;
        if(s!=null){
        srch = s.length*500;
        }
        int Nricharge = 0;
        if(s3!=null){
        Nricharge = 10000;
        }
        int ptax=0;
        if(s4.equals("Service")){
            ptax=1000;
        }
        else if(s4.equals("Business")){
            ptax=2000;
        }
        //step 3 provide the response to client
        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Income Tax Department </h2>");
        out.println("<h2>Thanks for visiting</h2>");
        out.println("<table border=2>");
        out.println("<tr>");
        out.println("<td>income</td>");
         out.println("<td>"+income+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>age</td>");
         out.println("<td>"+age+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>sr-charge</td>");
         out.println("<td>"+srch+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>NRI_charge</td>");
         out.println("<td>"+Nricharge+"</td>");
        out.println("</tr>");
         out.println("<tr>");
        out.println("<td>Prof-tax</td>");
         out.println("<td>"+ptax+"</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("<h3>Assets Declared by you: </h3>");
        out.println("<ol>");
        if(s!=null){
        for(String temp:s){
              out.println("<li>");
              out.println(temp);
              out.println("</li>");
              
        }
        }
        out.println("</ol>");
        out.println("<marquee>Pay your tax before 3 feb<marquee>");
        out.println("</body>");
        out.println("</html>");
        
       /*out.println("Thanks for visiting");
       out.println("Your tax is" + tax+"<br>");
         
       out.println("Pay your tax before 3 feb");*/
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
