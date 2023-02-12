import java.util.*;

class AgeInvalidException extends Exception
{
    AgeInvalidException(String str)
    {
        super (str);
    }
}

class UserDefinedException
{
    public static void main(String arg[]) 
    {
        Scanner sObj = new Scanner(System.in);
        System.out.println("Enter your age");
        int iAge = sObj.nextInt();

        try
        {
            if(iAge < 15)
            {
                //(Inline syntax) throw new AgeInvalidException("Your age is less than 15");
                AgeInvalidException aObj = new AgeInvalidException("Your age is lessthan 15");
                throw aObj;
            }
            else
            {
                System.out.println("Age is invalid");
            }
        }
        catch(AgeInvalidException Obj)
        {
            System.out.println(Obj);
        }
    }

}