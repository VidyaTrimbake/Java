import java.util.*;


class j244String 
{
    public static void main(String ar[]) 
    {
        Scanner sObj = new Scanner(System.in);
        
        System.out.println("PLease enter the string : ");
        String str = sObj.nextLine();

        MarvellousX obj = new MarvellousX();
        int iRet = obj.SmallCount(str);
        System.out.println("Number of small case letters are : "+iRet);
    }    
}

class MarvellousX
{
    public int SmallCount(String s)
    {
        int iCnt = 0;

        for(int i=0; i<s.length();i++)
        {
            if((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}