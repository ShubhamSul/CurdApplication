package ATdev.std.admin.dao;
import java.util.List;
import ATdev.std.admin.model.Student;

public interface StudentService {
	String addStudent(List <Student> lst);
	List<Student> retriveStudent(int stdId);
	boolean deleteStudent(int stdId);
	List <Student> getAllStudent();

}