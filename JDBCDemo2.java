package jdbcsession;
import java.sql.*;

public class JDBCDemo2 {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establishing the connection (path of db,username,pass)
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Pass@123");
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from student");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		}
		con.close();
	}

}
