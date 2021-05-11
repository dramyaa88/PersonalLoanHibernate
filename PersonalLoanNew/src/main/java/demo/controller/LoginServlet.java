package demo.controller;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import demo.model.login;
import demo.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
     String userId = request.getParameter("uname");   
     String password = request.getParameter("pass");
     LoginService loginService = new LoginService();
     boolean result = loginService.authenticateUser(userId, password);
     login admin = loginService.getAdminbyAdminId(userId);
     if(result == true){
         request.getSession().setAttribute("user", admin);      
         response.sendRedirect("home.jsp");
     }
     else{
         response.sendRedirect("error.jsp");
     }
}

}
