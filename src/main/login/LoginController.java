package main.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.authenticate.CheckCredentials;

/**
 * Servlet implementation class LoginController
 */
@WebServlet(description = "Simple Controller", urlPatterns = { "/login" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		CheckCredentials checkCredentials=new CheckCredentials();
		boolean result=checkCredentials.authenticate(userName, password);
		if(result) {
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("SuccessPage.jsp");
			request.setAttribute("userName", checkCredentials.getUserName(userName));
			requestDispatcher.forward(request, response);
		}else {
			response.sendRedirect("LoginMain.jsp");
		}
	}

}
