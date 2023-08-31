import java.util.*;

class ll{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    void insert(int val)
    {
        Node newo=new Node(val);
        Node temp=head;
        if(head==null)
        {
            head=newo;
        }
        else
        {
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newo;
        }
    }
    void insertFirst(int val)
    {
        Node newo=new Node(val);
        Node temp=head;
        head=newo;
        head.next=temp;
    }
    void insertParticular(int pos,int val)
    {
        int i=1;
        Node temp=head;
        while(true)
        {
            Node newo=new Node(val);
            if(pos==0)
            {
                
        Node tem=head;
        head=newo;
        head.next=tem;
        return;
            }
            if(i+1==pos)
            {
                Node te=temp.next;
                temp.next=newo;
                temp.next.next=te;
                return;

            }
            i+=1;
            temp=temp.next;
        }
    }
    void Deletefirst()
    {
        head=head.next;

    }
    void DeleteLast()
    {
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;

    }
    void DeleteParticularElement(int pos)
    {
        Node temp=head;
        int i=1;
        while(true)
        {
            
           if(pos==0)
           {
                head=head.next;
                return;
           }
            if(i+1==pos)
            {
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
            i+=1;
        }
    }
    void Modify(int val,int maval)
    {
        Node temp=head;
        while(true)
        {
            if(temp.data==val)
            {
                temp.data=maval;
                return;
            }
            temp=temp.next;
        }
    }
    void reverse()
    {
        Node temp=head;
        Node next=null;
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
}
class LLALL
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ll obj=new ll();
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            obj.insert(k);

        }
         obj.print();
         System.out.println("------------------------");
         obj.reverse();
        obj.print();
        
    }
}