package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoFormation;
import Dao.IDaoFormation;
import fr.adaming.model.Formation;

/**
 * Servlet implementation class ServletFormation
 */
@WebServlet("/ajoutFormation")
public class ServletFormation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFormation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/formulaireFormation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Formation f= new Formation();
		f.setTheme(request.getParameter("theme"));
		IDaoFormation dao = new DaoFormation();
	
	
	int i = dao.addFormation(f);

	if (i==1) {
		request.setAttribute("msg", "la formation a été ajouté avec succés ");
		
	}
	else {
		request.setAttribute("msg", "La formation n'a pa été ajouté ");
	}
//	List<Produit>prds=dao.getProduit();
//	request.setAttribute("produits", prds);
	this.getServletContext().getRequestDispatcher("/WEB-INF/message.jsp").forward(request, response);
}

	}


