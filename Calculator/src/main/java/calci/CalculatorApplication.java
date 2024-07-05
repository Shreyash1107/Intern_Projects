package calci;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate")
public class CalculatorApplication extends HttpServlet 
{       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String a = request.getParameter("First");
		String b = request.getParameter("Second");
		int sum = Integer.parseInt(a) + Integer.parseInt(b);
		int diff = Integer.parseInt(a) - Integer.parseInt(b);
		int mul = Integer.parseInt(a)*Integer.parseInt(b);
		double div = Double.parseDouble(a)/Double.parseDouble(b);
		out.println("<h4>Addition is " + sum + "</h4><br><br/>");
		out.println("<h4>Difference is " + diff + "</h4><br><br/>");
		out.println("<h4>Product is " + mul + "</h4><br><br/>");
		out.println("<h4>Division is " + div + "</h4><br><br/>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}