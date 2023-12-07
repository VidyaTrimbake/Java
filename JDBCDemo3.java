package jdbcsession;
import java.sql.*;
import java.util.*;
public class JDBCDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    // Loading the driver
        //Class.forName("com.mysql.cj.jdbc.Driver");
    //Establishing the connection
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","Pass@123");
    //Creating statement
        Statement stmt= con.createStatement();
   //Executing the query and getting the resultset
        System.out.println("---------------Please enter the students rollno you want to see the data------------");
                
        Scanner sc=new Scanner(System.in);
        int rollno=sc.nextInt();
//                System.out.println(rollno);
        
        ResultSet rs= stmt.executeQuery("select * from student where rollno= "+rollno);
  //Processing the resultset
while(rs.next())
{
    System.out.println("Rollno: "+rs.getObject(1) + "\nName: "+ rs.getObject(2)+"\nMarks: "+rs.getInt(3)+"\nCity: "+rs.getString(4)+"\nState: "+rs.getString(5));
    
}
//closing the connection        
con.close();        
        
    }
}