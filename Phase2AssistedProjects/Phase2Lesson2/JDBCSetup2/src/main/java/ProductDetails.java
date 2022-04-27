

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
           InputStream in = getServletContext().getResourceAsStream("/WEB-INF/lib/com.mysql.cj.jdbc.Driver");
           Properties props = new Properties();
           
           
           
           DBConnection conn = new DBConnection(props.getProperty("jdbc:mysql://localhost:3306/ecommerce"), props.getProperty("root"), props.getProperty("Root@password"));
           CallableStatement stmt = conn.getConnection().prepareCall("{call add_product(?, ?)}");
           stmt.setString(1, "new product");
           stmt.setBigDecimal(2, new BigDecimal(1900.50));
           stmt.executeUpdate();
           
           out.println("Stored procedure has been executed.<Br>");
           stmt.close();
           
           
           out.println("</body></html>");
           conn.closeConnection();
           
   } catch (ClassNotFoundException e) {
           e.printStackTrace();
   } catch (SQLException e) {
           e.printStackTrace();
   }

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
