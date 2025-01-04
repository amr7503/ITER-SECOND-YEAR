import java.util.Scanner;

class Node {
    int info;
    Node next;
}
public class StackUsingLinkedList{

        public static Node push(Node top)
        {
            Node node=new Node();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter data to push: ");
            node.info=sc.nextInt();

            node.next=top;
            top=node;
            return top;
        }
        /////////////////////////////////////////////////////////
        public static Node pop(Node top)
        {
            if(top==null) System.out.println("Underflow!! Stack is empty");
            else{
                System.out.println("Deleting top element "+top.info);
                top=top.next;
            }
            return top;
        }
        //////////////////////////////////////////////////////////
        public static void display(Node top){
            if(top==null) System.out.println("Nothing to display,Stack is empty!!");
            else{
                System.out.println("The stack elements are:::::::::");
                Node temp=top;
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
            Node top;
            top=null;
            while(true)
            {
                System.out.println("\n****MENU****");
                System.out.println("0:Exit");
                System.out.println("1:Push");
                System.out.println("2:Pop");
                System.out.println("3:Display");
                System.out.println("Enter your choice");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 0:
                        System.exit(0);
                    case 1:
                        top=push(top);
                        break;
                    case 2:
                        top=pop(top);
                        break;
                    case 3:
                        display(top);
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
1:Push
2:Pop
3:Display
Enter your choice
1
Enter data to push:
12

****MENU****
0:Exit
1:Push
2:Pop
3:Display
Enter your choice
1
Enter data to push:
23

****MENU****
0:Exit
1:Push
2:Pop
3:Display
Enter your choice
1
Enter data to push:
34

****MENU****
0:Exit
1:Push
2:Pop
3:Display
Enter your choice
3
The stack elements are:::::::::
34 23 12

****MENU****
0:Exit
1:Push
2:Pop
3:Display
Enter your choice
2
Deleting top element 34

****MENU****
0:Exit
1:Push
2:Pop
3:Display
Enter your choice
3
The stack elements are:::::::::
23 12

****MENU****
0:Exit
1:Push
2:Pop
3:Display
Enter your choice
0

Process finished with exit code 0

 */

