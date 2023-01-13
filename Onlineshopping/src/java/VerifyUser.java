/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import jakarta.servlet.RequestDispatcher;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class VerifyUser extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String s1 = request.getParameter("userid");
        String s2 = request.getParameter("password");
        String s3 = request.getParameter("usertype");    
        if(s3.equals("admin")) 
        {
            if(s1.equals("admin") && s2.equals("admin")){// admin info will be stored in web.xml file
                out.println("Welocme Admin");
                response.sendRedirect("adminhome.jsp");
            }else{
                out.println("Invalid admin");
            }
                
        }
        else{
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","*1234#@cv");
        String qr = "select userid,password from userinfo where userid=? and password=?";
        PreparedStatement ps = con.prepareStatement(qr);
        ps.setString(1,s1);
        ps.setString(2,s2);
        ResultSet rs = ps.executeQuery();
        boolean found = rs.next(); // for checking data is present or not
        if(found==true){
            out.println("Welcome Buyer");
             //RequestDispatcher rd = request.getRequestDispatcher("buyerhome.jsp");
             //rd.forward(request, response);
             response.sendRedirect("buyerhome.jsp");
        }
        else{
            out.println("Invalid buyer");
        }
        }
        catch(Exception e){
            out.println(e);
        }
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
