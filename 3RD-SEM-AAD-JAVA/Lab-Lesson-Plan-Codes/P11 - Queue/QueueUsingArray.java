
import java.util.Scanner;
public class QueueUsingArray {

    public static void insert(int Q[])//adding an element x to the rear end of the queue Q
    {
        if(is_full()) System.out.println("Queue is full(Overflow)");
        else{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter data to insert: ");
            int x=sc.nextInt();
            Q[++rear]=x;
        }
        if(rear==0) front=0;
    }
    public static void delete(int Q[])//deletes the element from the front of the queue Q
    {
        if(is_empty()) System.out.println("Queue is empty(Underflow)");
        else{
            System.out.println("Deleted element is: "+Q[front]);
            if(front==rear) {
                front=-1;
                rear=-1;
            }
            else
                front++;
        }
    }
    public static void display(int Q[])//display all the elements of the queue Q.
    {
        if(is_empty()) System.out.println("Queue is empty");
        else{
            System.out.println("Elements of queue are:::: ");
            for(int i=front;i<=rear;i++)
                System.out.print(Q[i]+" ");
            System.out.println();
        }
    }
    public static boolean is_full()//check if the queue is full or not.
    {
        return (rear==MAX-1);
    }
    public static boolean is_empty()//check if the queue is empty or not.
    {
        return (rear==-1 || front==-1);
    }

    public static final int MAX=5;
    public static int front=-1;
    public static int rear=-1;

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int queue[]=new int[MAX];

        while(true)
        {

            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 0:
                    System.exit(0);
                case 1:
                    insert(queue);
                    break;
                case 2:
                    delete(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                default:
                    System.out.println("Invalid choice");
            }//switch
        }//while
    }//main
}//class


/*

    |-----------------------------------|
    |    ::::       OUTPUT      ::::    |
    |-----------------------------------|


***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
1
Enter data to insert:
25
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
1
Enter data to insert:
45
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
1
Enter data to insert:
65
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
3
Elements of queue are::::
25 45 65
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
2
Deleted element is: 25
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
3
Elements of queue are::::
45 65
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
0

Process finished with exit code 0

 */