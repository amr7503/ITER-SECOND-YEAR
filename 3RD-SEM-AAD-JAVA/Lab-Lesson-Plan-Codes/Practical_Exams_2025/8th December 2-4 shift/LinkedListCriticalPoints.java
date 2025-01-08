import java.util.Scanner;

class Node
{
    int data;
    Node next;
}

public class LinkedListCriticalPoints
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        Node head=null;
        head=create(head);
        System.out.println("LinkedList ::::");
        display(head);

        Node temp=head.next;
        int previousData=head.data;
        int count=0;
        while(temp.next!=null)
        {
            //condition for critical point
            if((temp.data>previousData && temp.data>temp.next.data) || (temp.data<previousData && temp.data<temp.next.data))
                count++;

            previousData=temp.data;
            temp=temp.next;
        }

        System.out.println("Number of critical points = "+count);



    }

    public static Node create(Node head)
    {
        char ch;
        do{
            Node new_node =new Node();
            System.out.println("Enter the value of new node ");
            new_node.data=sc.nextInt();

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
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println(" End");
    }
}

/*

Enter the value of new node
1
Insert another node(y/n)?
y
Enter the value of new node
2
Insert another node(y/n)?
y
Enter the value of new node
3
Insert another node(y/n)?
y
Enter the value of new node
2
Insert another node(y/n)?
y
Enter the value of new node
1
Insert another node(y/n)?
y
Enter the value of new node
3
Insert another node(y/n)?
y
Enter the value of new node
2
Insert another node(y/n)?
n
LinkedList ::::
Start -> 1 -> 2 -> 3 -> 2 -> 1 -> 3 -> 2 ->  End
Number of critical points = 3

 */
