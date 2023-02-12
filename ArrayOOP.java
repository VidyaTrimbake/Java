import java.util.Scanner;
class ArrayX
{
    public int Arr[];
    public int iSize;

    public ArrayX(int No)
    {
        this.iSize = No;
        this.Arr = new int[iSize];
    }
    public void Accept()
    {
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        for(int iCnt = 0; iCnt < iSize; iCnt++);
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
    public void Display()
    {
        
        System.out.println("Enter the elements : ");
        for(int iCnt = 0; iCnt < iSize; iCnt++);
        {
            System.out.printl(Arr[iCnt]);
        }
    }
    public int Addition()
    {
        int iSum = 0;     
        for(int iCnt = 0; iCnt < iSize; iCnt++);
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum;
    }
}

class ArrayOOP
{
    public static void main(String Arr[])
    {
        ArrayX obj1 = new ArrayX(4);
        obj1.Accept();
        obj1.Display();

        int iRet = obj1.Addition();
        System.out.println("Addition is : "+iRet);
    }

}