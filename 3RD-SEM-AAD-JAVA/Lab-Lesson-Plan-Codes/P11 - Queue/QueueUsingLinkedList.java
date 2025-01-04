
import java.util.Scanner;

class Node
{
    int info;
    Node next;
}

public class QueueUsingLinkedList {
    static Node rear,front;

    public static void insert () //insertion at rear
    {
        Node node=new Node();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data to insert: ");
        node.info=sc.nextInt();

        if(front==null)
        {
            front=node;
            rear=node;
        }
        else{
            rear.next=node;
            rear=node;
        }

    }

    public static void delete () // deletion at front
    {
        if(front==null) System.out.println("Queue is Empty(Underflow)");
        else{
            System.out.println("Node to be deleted: "+front.info);

            front=front.next;

        }
        if(front==null) rear=null;

    }

    public static void display ()
    {
        Node temp=front;
        if(front==null) System.out.println("Queue is Empty");
        else{
            System.out.println("Elements of queue are:::: ");
            while(temp!=null)
            {
                System.out.print(temp.info+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Node rear=null,front=null;

        while(true)
        {
            System.out.println("\n****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Insert");
            System.out.println("2:Delete");
            System.out.println("3:Display");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 0:
                    System.exit(0);

                case 1:
                    insert();
                    break;

                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                default:
                    System.out.println("Wrong choice");
            }//switch
        }//while
    }//main
}//class

/*

    |-----------------------------------|
    |    ::::       OUTPUT      ::::    |
    |-----------------------------------|

****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
1
Enter data to insert:
23

****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
1
Enter data to insert:
34

****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
1
Enter data to insert:
45

****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
3
Elements of queue are::::
23 34 45

****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
2
Node to be deleted: 23

****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
3
Elements of queue are::::
34 45

****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
2
Node to be deleted: 34

****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
4
Wrong choice

****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
2
Node to be deleted: 45

****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
3
Queue is Empty

****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
0

Process finished with exit code 0

 */