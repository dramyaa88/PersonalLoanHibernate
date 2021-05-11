package demo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import demo.model.NewUser;

import demo.model.login;
import demo.service.UserDAO;


public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDao;

    public void init() {
        userDao = new UserDAO();
    }
    
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String mobileNumber = request.getParameter("mobileNumber");
		String country = request.getParameter("country");
		String panNumber = request.getParameter("panNumber");
		
		NewUser user = new NewUser(name,userId,password,country,mobileNumber,panNumber);
		userDao.saveUser(user);
		
		login login = new login(userId,password);
		userDao.saveUser(login);
		
//		loanDetails loan1 = new loanDetails(userId);
//		userDao.saveUser(loan1);
		
		String regex = "\\d{10}";
		boolean result = mobileNumber.matches(regex);
		if(result ==true) {
		    if(country.equalsIgnoreCase("india"))
		    {
		    	response.sendRedirect("PhoneCountryValid.jsp");
		    	
		    }
		    else
		    {
		    	response.sendRedirect("country.jsp");
		    }
		} else {
		    response.sendRedirect("phone.jsp");
		}
		
		
		
		
	}

}
