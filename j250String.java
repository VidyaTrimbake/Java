import java.util.*;


class j244String 
{
    public static void main(String ar[]) 
    {
        Scanner sObj = new Scanner(System.in);
        
        System.out.println("PLease enter the string : ");
        String str = sObj.nextLine();

        MarvellousX obj = new MarvellousX();
        int iRet = obj.CapCount(str);
        System.out.println("Number of capital case letters are : "+iRet);
    }    
}

class MarvellousX
{
    public int CapCount(String s)
    {
        int iCnt = 0;

        for(int i=0; i<s.length();i++)
        {
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}