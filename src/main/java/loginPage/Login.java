package loginPage;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginSRV")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		CheckDAO ch = new CheckDAO();
		
		try {
			if(ch.check(user, pass)) {
				
				HttpSession session = request.getSession();
				session.setAttribute(user, "mostafa");
				response.sendRedirect("home.jsp");
			}
			else
				response.sendRedirect("login.jsp");
		} catch (SQLException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
