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
import java.util.ArrayList;
import java.util.List;



public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public StudentController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int stdId=Integer.parseInt(request.getParameter("stdId"));
		String stdName=request.getParameter("stdName");
		int stdAge=Integer.parseInt(request.getParameter("stdAge"));
		String dept=request.getParameter("dept");
		
		Student stdObj=new Student(stdId, stdName, stdAge, dept);
		
		List<Student> lststudent=new ArrayList<Student>();
		lststudent.add(stdObj);
		
		StudentService stddao=new StudentServiceImpl();
		String str=stddao.addStudent(lststudent);
		System.out.println("In controller str is "+str);
		HttpSession session=request.getSession();
		if(str.equals("valid")) {
			str="Student data added Successfully to database";
			
		}
		session.setAttribute("msg",str);
		response.sendRedirect("Student.jsp");
		
	}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}