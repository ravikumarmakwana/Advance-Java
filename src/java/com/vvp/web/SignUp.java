/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vvp.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ravikumar Makwana
 */
public class SignUp extends HttpServlet {

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
            String name=request.getParameter("username");
            String pw=request.getParameter("password");
            String cpw=request.getParameter("confirmpassword");
            String phoneNo=request.getParameter("phoneno");
            String email=request.getParameter("email");
            String semester=request.getParameter("semester");
            String branch=request.getParameter("branch");
            String gender=request.getParameter("gender");
            String hobbies[]=request.getParameterValues("hobbies");
            String address=request.getParameter("address");

            String msg=new String();

            //userName Validation
            int l=name.length();
            if(l<6 || l>20)
                msg+="Username must be in between 6 to 20<br/>";

            //password Validation
            if(!pw.equals(cpw))
                msg+="Password and ConfirmPassword are not Same</br>";

            int c1=0,c2=0,c3=0;
            for(int i=0;i<pw.length();i++)
            {
                if(pw.charAt(i)>='0' && pw.charAt(i)<='9')
                    c1=1;
                if(pw.charAt(i)>='A' && pw.charAt(i)<='Z')
                    c2=1;
                if((pw.charAt(i)>=33 && pw.charAt(i)<=47)||(pw.charAt(i)>=58 && pw.charAt(i)<=64))
                    c3=1;
            }
            if(c1==0)
                msg+="Password must contain at least one digit<br/>";

            if(c2==0)
                msg+="Password must contain at least one Upper Case latter<br/>";

            if(c3==0)
                msg+="Password must contain at least one Special Character<br/>";

            //semester validation
            if(semester.length()==0)
                msg+="Semester Must be Selected<br/>";
            
            //branch validation
            if(branch.length()==0)
                msg+="Branch must be Selected<br/>";

            //email validation
           int firstChar=email.codePointAt(0);
           if(!((firstChar>=65 && firstChar<=90) ||(firstChar>=97 && firstChar<=122) || (firstChar>=48 && firstChar<=57)))
                msg+="Email must start with a-z or A-Z or 0-9<br/>";

           String partOfEmail[]=email.split("@");
           if(partOfEmail.length>2)
               msg+="Email must contain only one @ sign<br/>";

           if(email.indexOf("@")==-1)
               msg+="Email must require one @ sign<br/>";
           int s=1;
           for(int i=1;i<email.length();i++)
           {
               if(!((email.charAt(i)>=64 && email.charAt(i)<=90) || (email.charAt(i)>=91 && email.charAt(i)<=122) || (email.charAt(i)>=48 && email.charAt(i)<=57) || (email.charAt(i)>=33 && email.charAt(i)<=47)))
               {
                   s=0;
               }
           }

           if(s==0)
               msg+="Email should contain a to z, A to Z, 0 to 9 and Special charcters link !,#,$,%,&,',*,+,-,=,?,{.<br/>";

           //phoneNo Validation
            if(phoneNo.length()<=9 || phoneNo.length()>=11)
                msg+="phone number must conatin 9 to 11 digits<br/>";

            //gender Validation
            if(gender==null)
                msg+="Gender is Required<br/>";

            //hobbies Validation
           if(hobbies==null)
               msg+="Hobbies must be selected<br/>";
           else{
                int p=hobbies.length;
                    if(p<3)
                        msg+="At least three hobbes must be selected<br/>";
           }
            
            //address Validation
            int c4=0;
            for(int i=0;i<address.length();i++)
            {
                if(address.charAt(i)=='\n')
                    c4++;
            }
            if(c4<2)
                msg+="Address must contain at least three lines<br/>";

            String sendMsg="";
            if(msg.length()!=0)
            {
                sendMsg="SignUp Failed<br/>"+msg+"<br/>Try Again !!!!<br/>";
                response.sendRedirect("signup.jsp?msg= 'sendMsg' ");
            }
            else
            {
                sendMsg="Welcome"+name+"<br/>Sign Up Successful !!!!";
                response.sendRedirect("signup.jsp?msg=Sign Up Successful ! ! !");
            }
        } finally {
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
