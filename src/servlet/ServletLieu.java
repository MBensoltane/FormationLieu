package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoFormation;
import Dao.DaoLieu;
import Dao.IDaoFormation;
import Dao.IDaoLieu;
import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;

/**
 * Servlet implementation class ServletLieu
 */
@WebServlet("/ajoutLieu")
public class ServletLieu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLieu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/FormulaireLieu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Lieu l= new Lieu();
		l.setAdresse(request.getParameter("adresse"));
		l.setVille(request.getParameter("ville"));
	
		
		IDaoLieu dao = new DaoLieu();
	
	
	int i = dao.createLieu(l);

	if (i==1) {
		request.setAttribute("msg", "le lieu de la formation a été ajouté avec succés ");
		
	}
	else {
		request.setAttribute("msg", "Le lieu de la formation formation n'a pa été ajouté ");
	}
//	List<Produit>prds=dao.getProduit();
//	request.setAttribute("produits", prds);
	this.getServletContext().getRequestDispatcher("/WEB-INF/message.jsp").forward(request, response);
}

	

}

