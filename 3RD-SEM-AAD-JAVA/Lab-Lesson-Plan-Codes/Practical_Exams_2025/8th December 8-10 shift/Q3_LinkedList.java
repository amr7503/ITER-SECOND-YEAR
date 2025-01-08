import java.util.LinkedList;
import java.util.Scanner;

class Node
{
    int val;
    Node next;
}
public class Q3_LinkedList
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        Node headA=null,headB=null;
        System.out.println("Enter the nodes of LinkedList A where all elements are even numbers but one is odd");
        headA=create(headA);
        System.out.println("Enter the nodes of LinkedList B where all elements are odd numbers but one is even");
        headB=create(headB);

        System.out.println("LinkedLists before operations are :");
        display(headA);
        display(headB);


        Node temp1=headA;
        Node temp2=headB;

        while(temp1!=null)
        {
            if(temp1.val%2==1)
                break;
            temp1=temp1.next;
        }

        while(temp2!=null)
        {
            if(temp2.val%2==0)
                break;
            temp2=temp2.next;
        }

        //swap
        //if(temp1 != null && temp2 != null;) //might keep a check

        int t=temp1.val;
        temp1.val=temp2.val;
        temp2.val=t;


        System.out.println("LinkedLists after operations are :");
        display(headA);
        display(headB);

    }
    public static Node create(Node head)
    {
        char ch;
        do{
        Node new_node =new Node();
        System.out.println("Enter the value of new node ");
        new_node.val=sc.nextInt();

            if (head == null)
                head = new_node;
            else {
                Node temp = head;
                while (temp.next != null)
                    temp = temp.next;

                temp.next = new_node;
            }
            System.out.println("Insert another node(y/n)? ");
            ch=sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');

        return head;
    }
    public static void display(Node head)
    {
        System.out.print("Start -> ");
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println(" End");
    }
}


/*    :::::::   OUTPUT   :::::::

Enter the nodes of LinkedList A where all elements are even numbers but one is odd
Enter the value of new node
150
Insert another node(y/n)?
y
Enter the value of new node
52
Insert another node(y/n)?
y
Enter the value of new node
26
Insert another node(y/n)?
y
Enter the value of new node
31
Insert another node(y/n)?
y
Enter the value of new node
12
Insert another node(y/n)?
y
Enter the value of new node
64
Insert another node(y/n)?
n
Enter the nodes of LinkedList B where all elements are odd numbers but one is even
Enter the value of new node
23
Insert another node(y/n)?
y
Enter the value of new node
100
Insert another node(y/n)?
y
Enter the value of new node
7
Insert another node(y/n)?
y
Enter the value of new node
17
Insert another node(y/n)?
y
Enter the value of new node
3
Insert another node(y/n)?
n
LinkedLists before operations are :
Start -> 150 -> 52 -> 26 -> 31 -> 12 -> 64 ->  End
Start -> 23 -> 100 -> 7 -> 17 -> 3 ->  End
LinkedLists after operations are :
Start -> 150 -> 52 -> 26 -> 100 -> 12 -> 64 ->  End
Start -> 23 -> 31 -> 7 -> 17 -> 3 ->  End

 */