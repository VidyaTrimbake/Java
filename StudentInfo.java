import SY.SYMarks;
import TY.TYMarks;
import java.io.*;
import java.util.Scanner;

public class StudentInfo 
{
    public int RNo;
    public String Name;
    public void get()
    {
        Scanner sObj = new Scanner(System.in);
        RNo = sObj.nextInt();
        Name = sObj.nextLine(); 
    }
}

class StudentMarks
{
    public static void main(String arg[])
    {
        Scanner sObj =new Scanner(System.in);
        int No = sObj.nextInt();
        System.out.println("Enter the number of student:"+No);
        SYMarks sy[] = new SYMarks[No];
        TYMarks ty[] = new TYMarks[No];
        StudentInfo s[] = new StudentInfo[No];

        for(int i = 0; i < No; i++)
        {
            
        }
    }
}
