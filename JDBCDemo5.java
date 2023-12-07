package jdbcsession;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/constraints","root","Pass@123");

		}
		catch(exception e) {
			
		}
	}

}
