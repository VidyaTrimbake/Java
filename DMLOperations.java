package jdbcsessions;
import java.sql.*;
import java.util.*;

public class DMLOperations {

	public static void main(String[] args)throws ClassNotFoundException, SQLException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID");
		int OrderID = sc.nextInt();
		
		System.out.println("Enter the Product type:");
		String OrderType = sc.next();
		
		System.out.println("Enter the Product Quantity:");
		int OrderAmount = sc.nextInt();
		
		System.out.println(OrderID+" "+OrderType+" "+OrderAmount);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/constraints","root","Pass@123");
		Statement st = con.createStatement();
		String query = "insert into orders values(ordID,'Dell',25000)";
		
		int num_of_record = st.executeUpdate(query);
		System.out.println(num_of_record+" record inserted");
	}

}
