#include<stdio.h>
#include<string.h>

int main()
{
    char Arr[6] = "Hello";
    char * Ptr = Arr;
    int iCnt = 0;

    while(*Ptr != '\0')
    {
        iCnt++;
        Ptr++;
    }

    printf("Length of string is : %d\n",iCnt);
    
    return 0;
}