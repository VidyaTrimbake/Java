import java.sql.*; //Step 1

class Database
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/ppa41";
        String Username = "root";
        String Password = "root";
        String Query = "select * from student";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);  //Step2

        Statement sobj = cobj.createStatement();  //Step 3

        ResultSet robj = sobj.executeQuery(Query);  //Step 4

        while(robj.next())  //Step 5
        {
            System.out.println("RID : "+robj.getInt("RID"));
            System.out.println("Name : "+robj.getString("Name"));
            System.out.println("City : "+robj.getString("City"));
            System.out.println("Marks : "+robj.getInt("Marks"));                                    
        }
    }
}