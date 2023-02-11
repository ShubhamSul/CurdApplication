package ATdev.std.admin.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import ATdev.std.admin.dao.StudentService;
import ATdev.std.admin.daoimpl.StudentServiceImpl;
import ATdev.std.admin.model.Student;


import java.io.IOException;
import java.util.List;



public class SearchStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SearchStudentController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String msg=null;
		int stdId=Integer.parseInt(request.getParameter("stdId"));
			StudentService stddao=new StudentServiceImpl();
			List<Student> lststd=stddao.retriveStudent(stdId);
			HttpSession session=request.getSession();
			if(lststd!=null)
			{
				session.setAttribute("std",lststd);
			}
			else
			{
				msg="Invalid Student Id";
				session.setAttribute("std",msg);
			}
			response.sendRedirect("SearchStudent.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}