package houserental.controller.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import houserental.dto.User.User;
import houserental.service.Service.Service;
import houserental.util.Validations.Validations;

@WebServlet("/LogInServlet")
public class LogInServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		User user = new User();
		user.setEmail(email);
		user.setPassword(password);

		PrintWriter out = resp.getWriter();

		Validations validations = new Validations();
		Map<String, String> errorMessages = validations.logInValidate(user);

		if (errorMessages.size() > 0) {
			req.setAttribute("errorMessages", errorMessages);
			req.getRequestDispatcher("LogIn.jsp").forward(req, resp);
		} else {
			Service service = new Service();
			User logInDetails = service.logInService(user);
			if (logInDetails != null) {
				HttpSession session = req.getSession();
				session.setAttribute("logInDetails", logInDetails);
				resp.sendRedirect("welcome.jsp");
				out.print("Login succesful");
			} else {
				req.setAttribute("sqlerror", "some internal error occured");
				req.getRequestDispatcher("LogIn.jsp").forward(req, resp);
			}

		}

	}

}
