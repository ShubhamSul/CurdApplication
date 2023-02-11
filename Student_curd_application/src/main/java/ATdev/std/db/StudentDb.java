package ATdev.std.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDb {
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:XE","system","1234");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ConnectiontoDATABASE");
		return con;
	}

}