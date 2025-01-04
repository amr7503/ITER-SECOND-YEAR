import java.util.Scanner;

class Node{
    int data;
    Node next;
}

public class LinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=null; //Initially LL is empty

        while(true)
        {
            System.out.println("\n\nENTER YOUR CHOICE\n1.Create\n2.Display(Traversal)\n3.Insertion at any position\n4.Insertion at Start\n5.Insertion at End \n6.Delete at any position\n7.Delete at Start\n8.Delete at End\n9.Reverse");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    head=create(head);
                    break;
                case 2:
                    display(head);
                    break;
                case 3:
                    head=insert(head);
                    break;
                case 4:
                    head=insertAtStart(head);
                    break;
                case 5:
                    head=insertAtEnd(head);
                    break;
                case 6:
                    head=delete(head);
                    break;
                case 7:
                    head=deleteAtStart(head);
                    break;
                case 8:
                    head=deleteAtEnd(head);
                    break;
                case 9:
                    head=reverse(head);
                    break;

                default:
                    System.out.println("Invalid Input!! Try Again");
            }
        }
    }

    public static Node create(Node head)
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        do{
            Node new_node=new Node();
            System.out.println("Enter the data of new node");
            new_node.data=sc.nextInt();

            if(head==null)
                head=new_node;
            else {
                Node mover=head;
                while(mover.next!=null)
                    mover=mover.next; //traverse to the tail of LL
                mover.next=new_node;
            }
            System.out.println("Would you like to create another node(y/n)");
            ch = sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');

        return head;
    }

    public static Node insert(Node head)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the position to insert the new node");
        int pos = sc.nextInt();
        if(pos==1)
        {
            return insertAtStart(head);
        }

        Node new_node =new Node();
        System.out.println("Enter the data of new node");
        new_node.data=sc.nextInt();

        Node temp=head;
        for (int i = 1; i <= pos - 2; i++)
            temp = temp.next;
        new_node.next = temp.next;
        temp.next = new_node;
        return head;

    }
    public static Node insertAtStart(Node head)
    {
        Scanner sc=new Scanner(System.in);
        Node new_node =new Node();
        System.out.println("Enter the data of new node");
        new_node.data=sc.nextInt();

        new_node.next=head;
        head=new_node;
        return head;
    }
    public static Node insertAtEnd(Node head)
    {
        //Initial step
        Scanner sc=new Scanner(System.in);
        Node new_node =new Node();
        System.out.println("Enter the data of new node");
        new_node.data=sc.nextInt();

        //find tail(last node) by traversing
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
        return head;

    }
    public static Node delete(Node head)
    {
        Scanner sc = new Scanner(System.in);
        Node temp = head;
        System.out.println("Enter the position to delete the node : ");
        int pos = sc.nextInt();
        if(pos==1)
        {
            return deleteAtStart(head);
        }

        for (int i = 1; i <= pos - 2; i++)
            temp = temp.next;

        temp.next = temp.next.next;

        return head;
    }
    public static Node deleteAtStart(Node head) {
        // Node temp=head;
        head = head.next;
        // temp.next=null;
        return head;
    }
    public static Node deleteAtEnd(Node head) {
        if (head.next == null || head == null)
            return null; //Single Element or Empty

        Node temp = head;
        //point temp to the node before last node that needs to be deleted
        while (temp.next.next != null) {
            temp = temp.next;
        }
        //kill the last node
        temp.next = null;
        return head;
    }
    public static void display(Node head) {
        Node temp = head;
        System.out.print("START -> ");
        //Traversing the entire LinkedList and displaying
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println(" END");
    }

    public static Node reverse(Node head)
    {
        //Logic is changing the direction of next pointers
        Node mover=head;
        Node prev=null;
        while(mover != null)
        {
            Node next=mover.next;
            mover.next=prev; // 'next' points backwards
            prev=mover; //       know what the previous was
            mover=next; //       move 'mover' ahead
        }
        head=prev;
        return head;
    }

}

/*

    |-----------------------------------|
    |    ::::       OUTPUT      ::::    |
    |-----------------------------------|


ENTER YOUR CHOICE
1.Create
2.Display(Traversal)
3.Insertion at any position
4.Insertion at Start
5.Insertion at End
6.Delete at any position
7.Delete at Start
8.Delete at End
9.Reverse
1
Enter the data of new node
10
Would you like to create another node(y/n)
y
Enter the data of new node
20
Would you like to create another node(y/n)
y
Enter the data of new node
30
Would you like to create another node(y/n)
n


ENTER YOUR CHOICE
1.Create
2.Display(Traversal)
3.Insertion at any position
4.Insertion at Start
5.Insertion at End
6.Delete at any position
7.Delete at Start
8.Delete at End
9.Reverse
2
START -> 10 -> 20 -> 30 ->  END


ENTER YOUR CHOICE
1.Create
2.Display(Traversal)
3.Insertion at any position
4.Insertion at Start
5.Insertion at End
6.Delete at any position
7.Delete at Start
8.Delete at End
9.Reverse
3
Enter the position to insert the new node
3
Enter the data of new node
25


ENTER YOUR CHOICE
1.Create
2.Display(Traversal)
3.Insertion at any position
4.Insertion at Start
5.Insertion at End
6.Delete at any position
7.Delete at Start
8.Delete at End
9.Reverse
2
START -> 10 -> 20 -> 25 -> 30 ->  END


ENTER YOUR CHOICE
1.Create
2.Display(Traversal)
3.Insertion at any position
4.Insertion at Start
5.Insertion at End
6.Delete at any position
7.Delete at Start
8.Delete at End
9.Reverse
4
Enter the data of new node
69


ENTER YOUR CHOICE
1.Create
2.Display(Traversal)
3.Insertion at any position
4.Insertion at Start
5.Insertion at End
6.Delete at any position
7.Delete at Start
8.Delete at End
9.Reverse
2
START -> 69 -> 10 -> 20 -> 25 -> 30 ->  END


ENTER YOUR CHOICE
1.Create
2.Display(Traversal)
3.Insertion at any position
4.Insertion at Start
5.Insertion at End
6.Delete at any position
7.Delete at Start
8.Delete at End
9.Reverse
5
Enter the data of new node
99


ENTER YOUR CHOICE
1.Create
2.Display(Traversal)
3.Insertion at any position
4.Insertion at Start
5.Insertion at End
6.Delete at any position
7.Delete at Start
8.Delete at End
9.Reverse
2
START -> 69 -> 10 -> 20 -> 25 -> 30 -> 99 ->  END


ENTER YOUR CHOICE
1.Create
2.Display(Traversal)
3.Insertion at any position
4.Insertion at Start
5.Insertion at End
6.Delete at any position
7.Delete at Start
8.Delete at End
9.Reverse
6
Enter the position to delete the node :
3


ENTER YOUR CHOICE
1.Create
2.Display(Traversal)
3.Insertion at any position
4.Insertion at Start
5.Insertion at End
6.Delete at any position
7.Delete at Start
8.Delete at End
9.Reverse
2
START -> 69 -> 10 -> 25 -> 30 -> 99 ->  END


ENTER YOUR CHOICE
1.Create
2.Display(Traversal)
3.Insertion at any position
4.Insertion at Start
5.Insertion at End
6.Delete at any position
7.Delete at Start
8.Delete at End
9.Reverse
7


ENTER YOUR CHOICE
1.Create
2.Display(Traversal)
3.Insertion at any position
4.Insertion at Start
5.Insertion at End
6.Delete at any position
7.Delete at Start
8.Delete at End
9.Reverse
2
START -> 10 -> 25 -> 30 -> 99 ->  END


ENTER YOUR CHOICE
1.Create
2.Display(Traversal)
3.Insertion at any position
4.Insertion at Start
5.Insertion at End
6.Delete at any position
7.Delete at Start
8.Delete at End
9.Reverse
8


ENTER YOUR CHOICE
1.Create
2.Display(Traversal)
3.Insertion at any position
4.Insertion at Start
5.Insertion at End
6.Delete at any position
7.Delete at Start
8.Delete at End
9.Reverse
2
START -> 10 -> 25 -> 30 ->  END


ENTER YOUR CHOICE
1.Create
2.Display(Traversal)
3.Insertion at any position
4.Insertion at Start
5.Insertion at End
6.Delete at any position
7.Delete at Start
8.Delete at End
9.Reverse
9


ENTER YOUR CHOICE
1.Create
2.Display(Traversal)
3.Insertion at any position
4.Insertion at Start
5.Insertion at End
6.Delete at any position
7.Delete at Start
8.Delete at End
9.Reverse
2
START -> 30 -> 25 -> 10 ->  END

 */
