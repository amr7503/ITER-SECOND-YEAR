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
        Node head1=null,head2=null;
        System.out.println("Enter the nodes of LinkedList 1");
        head1=create(head1);
        System.out.println("Enter the nodes of LinkedList 2");
        head2=create(head2);

        System.out.println("List1 :");
        display(head1);
        System.out.println("List2 :");
        display(head2);

        if(head1.next==null) //check if List1 has less than 2 elements
        {
            head1.next=head2;
        }
        else{
            Node tail=head2; //find tail of head2
            while(tail.next!=null)
                tail=tail.next;

            tail.next=head1.next.next;
            head1.next.next=head2;
        }
        System.out.println("List1 after appending List 2 :");
        display(head1);

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

/*

Enter the nodes of LinkedList 1
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
4
Insert another node(y/n)?
n
Enter the nodes of LinkedList 2
Enter the value of new node
5
Insert another node(y/n)?
y
Enter the value of new node
6
Insert another node(y/n)?
n
List1 :
Start -> 1 -> 2 -> 3 -> 4 ->  End
List2 :
Start -> 5 -> 6 ->  End
List1 after appending List 2 :
Start -> 1 -> 2 -> 5 -> 6 -> 3 -> 4 ->  End

 */
