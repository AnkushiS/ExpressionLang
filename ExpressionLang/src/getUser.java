

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class getUser
 */
@WebServlet("/getUser")
public class getUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Address addr = new Address("street", "counter" ,"MD","germantown");
		
		User user = new User();
		
		user.setFirstname("abc");
		user.setLastname("xyz");
		user.setEmail("abc_skdj@gmail.com");
		
		Address adr = new Address();
		adr.setCity("germantown");
		adr.setState("MD");
		adr.setStreet("seneca hwy");
		adr.setZip("45201");
		
		user.setAdr(adr);		
		request.getSession().setAttribute("user", user);
		getServletContext().getRequestDispatcher("/Display.jsp").forward(
				request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
