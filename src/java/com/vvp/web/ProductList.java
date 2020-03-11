/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vvp.web;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Ravikumar Makwana
 */
public class ProductList extends HttpServlet {
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            HttpSession session=request.getSession();
            int pid = Integer.parseInt(request.getParameter("pid"));
            int q = Integer.parseInt(request.getParameter("q"));
            HashMap <Integer,Integer> cartList=(HashMap <Integer,Integer>)session.getAttribute("cart");
            if(cartList==null)
            {
                HashMap <Integer,Integer> temp=new HashMap<Integer,Integer>();
                temp.put(new Integer(pid),new Integer(q));
                session.setAttribute("cart", temp);
            }
            else
            {
                cartList.put(new Integer(pid),new Integer(q));
                session.setAttribute("cart", cartList);
            }
            double price=Float.parseFloat(request.getParameter("price"));
            int userId=(Integer)session.getAttribute("loginID");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ajt7030","root","");
            Statement stmt=(Statement) con.createStatement();
            int row=stmt.executeUpdate("Insert into cart (cartid,userid,pid,q,price) values (NULL,'"+userId+"','"+pid+"','"+q+"','"+price+"')");

            response.sendRedirect("productlist.jsp");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally {
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
