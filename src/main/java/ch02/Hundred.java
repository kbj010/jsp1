package ch02;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Hundred")
public class Hundred extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		PrintWriter out = response.getWriter();
//		print와 println차이는 소스볼 때 html문서를 줄바꿈 여부
		out.print("<html><body>");
		out.print("<h2>"+sum+"</h2>");
		out.print("</body></html>");
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}