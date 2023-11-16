import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HomePage extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
	PrintWriter pw=res.getWriter();
	pw.println("<html><title>Online Banking System</title>");
	pw.println("<body bgcolor=\"lightgray\"><font face=\"arial\" color=\"red\">");
	pw.println("<center><h1>Online Banking System</h1></center></font><hr><br><br>");
	pw.println("<font face=\"arial\" color=\"green\"><h2>New Account Opening</h2><br><br>");
	pw.println("<h2>Payin System</h2><br><br><h2>Withdrawl</h2><br><br>");
	pw.println("<h2>Reports Management System</h2><br><br></font><hr><center>");
	pw.println("<a href=\"E:/Veni/Web/DashBoard.html\">Click Here to DashBoard</a>");
	pw.println("</center></body></html>");
	}
}