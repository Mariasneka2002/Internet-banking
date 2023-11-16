import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class NewAccount extends HttpServlet
{
Connection cn;
Statement st;
ResultSet rs;
int d1,d7,d9;
String d2,d3,d4,d5,d6,d8,d10;
	public void init(ServletConfig config)throws ServletException
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		cn=DriverManager.getConnection("jdbc:odbc:DSN");
		st=cn.createStatement();
		}catch(Exception e1){}
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
	PrintWriter pw=res.getWriter();
	pw.println("<html><title>New Account</title>");
	pw.println("<body bgcolor=\"lightgray\" text=\"white\"><br>");
	pw.println("<center><h1>New Account Opening Form</h1><hr><br>");
	pw.println("<form method=\"post\" action=\"http://localhost:8080/examples/servlet/NewAccount\">");
	pw.println("<table border=\"2\" cellpadding=\"12\" cellspcing=\"12\">");
	pw.println("<tr><th>Account No</th><td><input type=\"text\" name=\"T1\"></td></tr>");
	pw.println("<tr><th>Name</th><td><input type=\"text\" name=\"T2\"></td></tr>");
	pw.println("<tr><th>Address 1</th><td><input type=\"text\" name=\"T3\"></td></tr>");
	pw.println("<tr><th>Address 2</th><td><input type=\"text\" name=\"T4\"></td></tr>");
	pw.println("<tr><th>Account Type</th><td><input type=\"text\" name=\"T5\"></td></tr>");
	pw.println("<tr><th>Opening Date</th><td><input type=\"text\" name=\"T6\"></td></tr>");
	pw.println("<tr><th>Opening Amount</th><td><input type=\"text\" name=\"T7\"></td></tr>");
	pw.println("<tr><th>Transaction Date</th><td><input type=\"text\" name=\"T8\"></td></tr>");
	pw.println("<tr><th>Current Balance</th><td><input type=\"text\" name=\"T9\"></td></tr>");
	pw.println("<tr><th>Reference</th><td><input type=\"text\" name=\"T10\"></td></tr>");
	pw.println("</table><br><input type=\"Submit\" name=\"b1\" value=\"Submit\">");
	pw.println("<input type=\"Reset\" name=\"b2\" value=\"Reset\">");
	pw.println("</form></center></body></html>");
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
	PrintWriter pw=res.getWriter();
	d1=Integer.parseInt(req.getParameter("T1"));
	d2=req.getParameter("T2");
	d3=req.getParameter("T3");
	d4=req.getParameter("T4");
	d5=req.getParameter("T5");
	d6=req.getParameter("T6");
	d7=Integer.parseInt(req.getParameter("T7"));
	d8=req.getParameter("T8");
	d9=Integer.parseInt(req.getParameter("T9"));
	d10=req.getParameter("T10");
		try
		{
		rs=st.executeQuery("insert into newac values()");
		}catch(Exception e2){}
	}
}