import java.util.*;

class j450SLLComplete
{
    public static void main(String Arg[])
    {
        SinglyLL obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();

        int ret = obj.CountNodes();
        System.out.println("Number of nodes are: "+ret);

        obj.InsertLast(101);
        obj.InsertLast(201);
        obj.InsertLast(301);

        obj.Display();

        ret = obj.CountNodes();
        System.out.println("Number of nodes are: "+ret);

        
        obj.DeleteFirst();
        obj.DeleteLast();

        obj.Display();

        ret = obj.CountNodes();
        System.out.println("Number of nodes after deletion are: "+ret);

        obj.InsertAtPos(500,3);
        obj.InsertAtPos(600,4);

        obj.Display();

        ret = obj.CountNodes();
        System.out.println("Number of nodes after deletion are: "+ret);

        obj.DeleteAtPos(3);
        obj.DeleteAtPos(4);

        obj.Display();

        ret = obj.CountNodes();
        System.out.println("Number of nodes after deletion are: "+ret);
    }
}

class Node
{
    public int Data;
    public Node Next;

    public Node(int No)
    {
        this.Data = No;
        this.Next = null;
    }
}

class SinglyLL
{
    private Node Head;
    private int Count;

    public SinglyLL()
    {
        Head = null;
        Count = 0;
    }

    protected void finalize()
    {
        // Memory free
    }

    public void InsertFirst(int No)
    {
        Node newn = new Node(No);

        if(this.Head == null)
        {
            this.Head = newn;
        }
        else
        {
            newn.Next = this.Head;
            this.Head = newn;
        }
        this.Count++;
    }

    public void InsertLast(int No)
    {
        Node newn = new Node(No);

        if(this.Head == null)
        {
            this.Head = newn;
        }
        else
        {
            Node temp = Head;
            while(temp.Next != null)
            {
                temp = temp.Next;
            }
            temp.Next = newn;
        }
        this.Count++;   
    }
    public void DeleteFirst()
    {
        if(this.Count == 0)
        {
            System.out.println("LL is empty");
            return;
        }
        else if(this.Count == 1)
        {
            this.Head = null;
        }
        else
        {
            Head = Head.Next;
        }
        this.Count--;
    }

    public void DeleteLast()
    {
        if(this.Count == 0)
        {
            System.out.println("LL is empty");
            return;
        }
        else if(this.Count == 1)
        {
            this.Head = null;
        }
        else
        {
            Node temp = this.Head;
            while(temp.Next.Next != null)
            {
                temp = temp.Next;
            }
            temp.Next = null;
        }
        this.Count--;
    }

    public void InsertAtPos(int No,int iPos)
    {
        if((iPos < 1) || (iPos > Count+1))
        {
            System.out.println("Invalid position");
        }
        if(iPos == 1)
        {
            InsertFirst(No);
        }
        else if(iPos == Count + 1)
        {
            InsertLast(No);
        }
        else
        {
            Node newn = new Node(No);
            Node temp = Head;
            for(int i = 1;i < iPos-1; i++)
            {
                temp = temp.Next;
            }
            newn.Next = temp.Next;
            temp.Next = newn;
        }
        this.Count++;
    }

    public void DeleteAtPos(int iPos)
    {
        if((iPos < 1) || (iPos > Count+1))
        {
            System.out.println("Invalid position");
        }
        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == Count + 1)
        {
            DeleteLast();
        }
        else
        {
            Node temp = Head;
            for(int i = 1; i < iPos-1; i++)
            {
                temp = temp.Next;
            }
            temp.Next = temp.Next.Next;
        }
        this.Count--;
    }
    public void Display()
    {
        Node temp = this.Head;

        while(temp != null)
        {
            System.out.print("| "+temp.Data+" |->");
            temp = temp.Next;
        }
        System.out.println("NULL");
    }
    public int CountNodes()
    {
        return this.Count;
    }
}

