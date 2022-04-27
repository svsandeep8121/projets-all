

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class App
 */
@WebServlet("/app")
public class App extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public App() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		  String pId = request.getParameter("productId");
		  String pName = request.getParameter("productName");
		  String pPrice = request.getParameter("productPrice");
		  
		  HttpSession theSession = request.getSession();
		  
		  theSession.setAttribute("pid", pId);
		  theSession.setAttribute("pname", pName);
		  theSession.setAttribute("pprice", pPrice);
		  
		  response.sendRedirect("display.jsp");
		  

	}

}
