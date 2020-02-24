package houserental.controller.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import houserental.dto.User.User;
import houserental.util.Validations.Validations;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fullname=req.getParameter("fullname");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String owner=req.getParameter("owner");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String confirmpassword=req.getParameter("confirmpassword");
		
		User user=new User();
		
		user.setFullname(fullname);
		user.setEmail(email);
		user.setMobile(mobile);
		user.setOwner(owner);
		user.setUsername(username);
		user.setPassword(password);
		user.setConfirmpassword(confirmpassword);
	PrintWriter out=resp.getWriter();
		Validations validations=new Validations();
		Map<String,String> errorMessages=validations.validate(user);
		
		if(errorMessages.size()>0) {
			req.setAttribute("errorMessages",errorMessages);
			req.getRequestDispatcher("Registration.jsp").forward(req, resp);
		}else {
			
		EntityManagerFactory entityManagerFactor=Persistence.createEntityManagerFactory("houserental");
		EntityManager entityManager=entityManagerFactor.createEntityManager();
		EntityTransaction transcation=entityManager.getTransaction();
		out.println("inserted");
		try {
			transcation.begin();
			entityManager.persist(user);
			transcation.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			transcation.rollback();
		}finally {
			entityManager.close();
			entityManagerFactor.close();
		}
			
		}
		
		
	}

}
