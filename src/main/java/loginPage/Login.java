package loginPage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginSRV")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		if(user.equals("mostafa") == pass.equals("1234")) {
			
			HttpSession session = request.getSession();
			session.setAttribute(user, "mostafa");
			
			response.sendRedirect("home.jsp");
		
		}
	}

}
