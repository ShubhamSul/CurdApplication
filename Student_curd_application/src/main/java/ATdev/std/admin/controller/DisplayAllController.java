package ATdev.std.admin.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


import java.io.IOException;
import java.util.List;

import ATdev.std.admin.dao.StudentService;
import ATdev.std.admin.daoimpl.StudentServiceImpl;
import ATdev.std.admin.model.Student;

/**
 * Servlet implementation class DisplayAllController
 */
public class DisplayAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public DisplayAllController() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentService stddao=new StudentServiceImpl();
		List<Student>lststd=stddao.getAllStudent();
		if(lststd!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("stdlst", lststd);
		}
		response.sendRedirect("DisplayAllView.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}