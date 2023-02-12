

class Employee implements Cloneable
{
    public int eId;
    public String eName;
    public int eSalary;

    public Employee(int iNo ,String str, int iValue)
    {
        this.eId = iNo;
        this.eName = str;
        this.eSalary = iValue;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class CloneDemo
{
    public static void main(String arg[]) 
    {
        try
        {
            Employee eObj1 = new Employee(101, "Rahul", 11000);
            Employee eObj2 = (Employee)eObj1.clone();

            System.out.println("Name of first employee: "+eObj1.eName);
            System.out.println("Name of second employee: "+eObj2.eName);

            System.out.println("Salary of first employee: "+eObj1.eSalary);
            System.out.println("Salary of Second employee: "+eObj2.eSalary);    
            
            eObj1.eName = "Sagar";
            
            System.out.println("Name of first employee: "+eObj1.eName);
            System.out.println("Name of second employee: "+eObj2.eName);
        }
    catch(CloneNotSupportedException cObj)
    {

    }
    }
}    