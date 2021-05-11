package demo.controller;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import demo.model.loanDetails;
import demo.service.UserDAO;


public class HandSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UserDAO userdao = new UserDAO();
    
    public HandSalaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int monthlySalary = Integer.parseInt(request.getParameter("monthlySalary"));
		int expense = Integer.parseInt(request.getParameter("expense"));
		int loanAmount = Integer.parseInt(request.getParameter("loanAmount"));
		int tenure = Integer.parseInt(request.getParameter("tenure"));
		String uname = request.getParameter("uname");
		
		loanDetails loan = new loanDetails(uname,monthlySalary,expense,loanAmount,tenure);
		userdao.saveUser(loan);
		
		int principal,totalInterestPayable,rateInPercent=10,EMI,totalAmount;
	
		int inHandSalary = monthlySalary - expense;
		if (inHandSalary > 15000) {
			principal = loanAmount;

			
			try
            {
                totalInterestPayable = (principal * tenure * rateInPercent) / 100;
                EMI = (principal + totalInterestPayable) / tenure;
                totalAmount = principal+EMI;
                HttpSession session = request.getSession();
                session.setAttribute("EMI", EMI);
                session.setAttribute("totalAmount", totalAmount);
                response.sendRedirect("interestdisplay.jsp");

            }catch(ArithmeticException e)
            {
            	e.printStackTrace();
            }
		}
		else
		{
			response.sendRedirect("salaryerror.jsp");
		}
	}

	

}
