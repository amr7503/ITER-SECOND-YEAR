import java.util.Scanner;
public class StackUsingArray
{
        public static boolean isEmpty(int top){
            return (top==-1);
        }
        public static boolean isFull(int top){
            return (top==MAX-1);
        }
        ///////////////////////////////////////////////////////////////
        public static int push(int S[],int top)
        {
            if(isFull(top))
            {
                System.out.println("Stack is full(Overflow)");
            }
            else{
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter data to push: ");
                int x=sc.nextInt();
                S[++top]=x;
            }
            return top;
        }
        ///////////////////////////////////////////////////////////////
        public static int pop(int S[],int top){
            if(isEmpty(top)){
                System.out.println("Stack is empty(Underflow)");
            }
            else{
                System.out.println("Popped element is: "+S[top]);
                top--;
            }
            return top;
        }
        ////////////////////////////////////////////////////////////
        public static void display(int S[],int top){
            if(isEmpty(top)) System.out.println("Nothing to display,Stack is empty!!");
            else{
                System.out.println("The stack elements are:::::::::");
                for(int i=0;i<=top;i++)
                    System.out.print(S[i]+" ");
                System.out.println();
            }
        }
        ///////////////////////////////////////////////////////////
        /* Write the code for remaining user defined methods*/
        public static final int MAX=10;

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int stack[]=new int[MAX];
            int top=-1;
            while(true)
            {
                System.out.println("***MENU***");
                System.out.println("0: Exit");
                System.out.println("1: Push");
                System.out.println("2: Pop");
                System.out.println("3: Display");
                System.out.println("Enter your choice");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 0:
                        System.exit(0);
                    case 1:
                        top=push(stack,top);
                        break;
                    case 2:
                        top=pop(stack,top);
                        break;
                    case 3:
                        display(stack,top);
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
1: Push
2: Pop
3: Display
Enter your choice
1
Enter data to push:
25
***MENU***
0: Exit
1: Push
2: Pop
3: Display
Enter your choice
1
Enter data to push:
67
***MENU***
0: Exit
1: Push
2: Pop
3: Display
Enter your choice
1
Enter data to push:
55
***MENU***
0: Exit
1: Push
2: Pop
3: Display
Enter your choice
3
The stack elements are:::::::::
25 67 55
***MENU***
0: Exit
1: Push
2: Pop
3: Display
Enter your choice
2
Popped element is: 55
***MENU***
0: Exit
1: Push
2: Pop
3: Display
Enter your choice
3
The stack elements are:::::::::
25 67
 */