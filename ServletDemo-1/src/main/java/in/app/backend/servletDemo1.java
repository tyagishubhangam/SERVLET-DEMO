package in.app.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class servletDemo1 extends HttpServlet{
	@Override	
	protected void service(HttpServletRequest request, HttpServletResponse response)throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1>THIS IS MY SERVLET DEMO</h1>");
	}
}