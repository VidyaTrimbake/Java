package Marvellous.PPA;       //Nested package

public class Loop
{ 
  public void Display()
  {
    int Arr[] = new int[4];

    Arr[0] = 10;
    Arr[1] = 20;
    Arr[2] = 30;
    Arr[3] = 40;

    System.out.println("Elements of array are: ");

    for(int iCnt = 0; iCnt<Arr.length; iCnt++)
    {
        System.out.println(Arr[iCnt]);
    }
  }
}