package demo.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.model.NewUser;
import demo.service.UserDAO;




public class UserManagementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDao;

    public void init() {
        userDao = new UserDAO();
    }
    public UserManagementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		String choice=request.getParameter("choice");
		try {
		switch(choice)
		{
		case "update":
			updateUser(request,response);
			//userdao.updateUser(uname,mobileNumber);
			break;
		case "getUser":
			getUser(request,response);
			//userdao.getUser(userId);
			break;
		case "delete":
			deleteUser(request,response);
			//userdao.deleteUser(userId);
			break;
		case "getAll":
			getAllUser(request,response);
			//userdao.getAllUser();
			break;
		case "doc":
			if(request.getParameter("enter").equalsIgnoreCase("yes"))
			{
				response.sendRedirect("loanDetails.jsp");
			}
			else
			{
				response.sendRedirect("documentneed.jsp");
			}
			break;
		}
		}catch (SQLException ex) {
            throw new ServletException(ex);
        }
	}


	private void getAllUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
		// TODO Auto-generated method stub
		List < NewUser > listUser = userDao.getAllUser();
        request.setAttribute("listUser", listUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
        dispatcher.forward(request, response);
		
	}


	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
		// TODO Auto-generated method stub
		String userId = request.getParameter("UserId");
        userDao.deleteUser(userId);
        
        response.sendRedirect("deleteSuccess.jsp");
		
	}


	private void getUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
		// TODO Auto-generated method stub
		String userId = request.getParameter("userId");
		NewUser listUser = userDao.getUser(userId);
		request.setAttribute("listUser", listUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-list1.jsp");
        dispatcher.forward(request, response);
        
        
	}


	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
		// TODO Auto-generated method stub
		String mobileNumber = request.getParameter("mobileNumber");
		String userId = request.getParameter("uname");
		
		NewUser user = new NewUser(userId, mobileNumber);
		userDao.updateUser(user);
		
		response.sendRedirect("phoneUpdate.jsp");
		
	}

}
