package in.myApp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class app extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)throws IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		System.out.println("NAME: "+name);
		System.out.println("EMAIL: "+ email);
		PrintWriter out = response.getWriter();
		out.print("Welcome "+ name);
		out.print("Email: "+email);
	}
}