package houserental.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import houserental.dto.RentalHouse;
import houserental.dto.User;
import houserental.service.Service;

@WebServlet("/displayDetails")
public class DisplayDetails extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		User  user= (User) session.getAttribute("user");
		PrintWriter out = resp.getWriter();
		Service service = new Service();
		List<RentalHouse> details=service.getHouses(user.getId());
		if(details.size()>0) {
			req.setAttribute("details",details);
			req.getRequestDispatcher("AddHouseRentaldetails.jsp").forward(req, resp);
		}else {
			out.print("Not Found");
			req.getRequestDispatcher("addhouserental.jsp").forward(req, resp);
		}
	
		
	}

}
