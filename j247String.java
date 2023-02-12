import java.util.*;


class j244String 
{
    public static void main(String ar[]) 
    {
        Scanner sObj = new Scanner(System.in);
        
        System.out.println("PLease enter the string : ");
        String str = sObj.nextLine();

        MarvellousX obj = new MarvellousX();
        int iRet = obj.DigitCount(str);
        System.out.println("Number of digits are : "+iRet);
    }    
}

class MarvellousX
{
    public int DigitCount(String s)
    {
        int iCnt = 0;

        for(int i=0; i<s.length();i++)
        {
            if((s.charAt(i) >= '0') && (s.charAt(i) <= '9'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}