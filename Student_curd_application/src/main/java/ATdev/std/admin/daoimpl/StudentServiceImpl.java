package ATdev.std.admin.daoimpl;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import ATdev.std.admin.dao.StudentService;
import ATdev.std.admin.model.Student;
import ATdev.std.db.StudentDb;


public class StudentServiceImpl implements StudentService{

	@Override
	public String addStudent(List<Student> lst) {
		String str=null;
		StudentDb stdObj=new StudentDb();
		Connection con=stdObj.getConnection();
		Student std=lst.get(0);
		int i=0;
		
		try {
			PreparedStatement pstate = con.prepareStatement("insert into student values(?,?,?,?)");
			pstate.setInt(1, std.getStdID());
			pstate.setString(2, std.getStdName());
			pstate.setInt(3,std.getStdAge());
			pstate.setString(4, std.getDept());
			i=pstate.executeUpdate();
		    if(i>0) {
		    	str="valid";
		    }
		} catch (SQLException e) {
			System.out.println("test1..");
			System.out.println(e.getMessage());
			str=e.getMessage();
			e.printStackTrace();
		}
		
		return str;
	}

	@Override
	public List<Student> retriveStudent(int stdId) {
		List<Student> stdlst=null;
		StudentDb stdObj=new StudentDb();
		Connection con=stdObj.getConnection();
		
		
		try {
			PreparedStatement pstate = con.prepareStatement("select*from student where stdId=?");
			pstate.setInt(1, stdId);
			ResultSet rs=pstate.executeQuery();
			if(rs.next()) {
				stdlst=new ArrayList<Student>();
				Student std=new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
				stdlst.add(std);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		
		return stdlst;
	}

	@Override
	public boolean deleteStudent(int stdId) {
		StudentDb stdObj=new StudentDb();
		Connection con=stdObj.getConnection();
		try {
			PreparedStatement pstate=con.prepareStatement("delete from student  where stdId=?");
			pstate.setInt(1, stdId);
			boolean rd=pstate.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> stdlst=new LinkedList<Student>();
		StudentDb stdObj=new StudentDb();
		Connection con=stdObj.getConnection();
	
		try {
			PreparedStatement pstate=con.prepareStatement("select*from student");
			ResultSet rs=pstate.executeQuery();
			stdlst=new ArrayList<Student>();
			while(rs.next()) {
				Student std=new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
				stdlst.add(std);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return stdlst;
	}

}