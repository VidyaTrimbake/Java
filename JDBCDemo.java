package jdbcsession;
import java.sql.*;
public class JDBCDemo {

	public static void main(String[] args)throws ClassNotFoundException, SQLException{
		
		//loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establishing the connection (path of db,username,pass)
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/constraints","root","Pass@123");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from orders");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		con.close();
	}

}
