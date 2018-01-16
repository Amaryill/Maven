package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.VillesBO;
import bo.VillesBOImpl;
import connectMySQL.Distance;
import model.Villes;

/**
 * Servlet implementation class GetDistance
 */
@WebServlet("/GetDistance")
public class GetDistance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetDistance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getAttribute("Distance")!=null){
			request.removeAttribute("Distance");
		}
		
		try {
			Villes ville = new Villes();
			VillesBO bo1 = new VillesBOImpl();
			List<Villes> villes = new ArrayList<Villes>();;
			
			String[] res = request.getParameterValues("villes");

			for (int i= 0; i<res.length;i++){
				ville.setCodeCommune(Integer.parseInt(res[i]));
				ville = bo1.trouverVille(ville.getCodeCommuneINSEE());
				villes.add(ville);
				System.out.println(ville.getNom_commune());
			}
			Distance dist = new Distance();
			String distance = dist.distance(villes.get(0), villes.get(1));
			System.out.println(distance);
			request.setAttribute("Distance", distance);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
		doGet(request, response);
	}

}
