import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
public class WelcomeServlet extends HttpServlet {  
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
	  
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  

		String username = request.getParameter("username").toUpperCase();  
		
		out.print("<body align=center><h1><font color=green>Login Success, Welcome <font color=blue>"+username+"</font></font><body><br/><br/><br/><a href=index.jsp>Logout</a><br/>");  
		
		out.close();  
	}  
  
}  
