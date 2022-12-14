

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForTestServlet
 */
@WebServlet("/forTest")
public class ForTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = request.getParameter("message");
		String repeat = request.getParameter("repeat");
		
		int repeats = Integer.parseInt(repeat); 
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
				
		for (int i = 0; i < repeats; i++) {
			out.println("<h1>" + message + "</h1>");
		}
	}

}
