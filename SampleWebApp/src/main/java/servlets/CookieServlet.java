/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author root
 */
public class CookieServlet extends HttpServlet {

    int visits;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CookieServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            if(!isVisitorCookieExists(request))
            {
                Cookie c = new Cookie("visit", "1");
                visits=1;
                response.addCookie(c);
            }
            else
            {
                Cookie cookies[] = request.getCookies();
                for(Cookie c : cookies)
                {
                    if(c.getName().equals("visit"))
                    {
                        visits= Integer.parseInt(c.getValue())+1;
                        c.setValue(String.valueOf(visits));
                        response.addCookie(c);
                        break;
                    }
                }
            }
            
            
            out.println("<h1> You have visted this page "+ visits+ " times !!!");
            
            
            
            out.println("<br/><h1>Servlet CookieServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    private boolean isVisitorCookieExists(HttpServletRequest request)
    {
        Cookie cookies[] = request.getCookies();
        
        if(cookies !=null)
        {
            for(Cookie c : cookies)
            {
                if(c.getName().equals("visit"))
                    return true;
            }
            
        }
        
        
        return false;
    }
    
     /*
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
