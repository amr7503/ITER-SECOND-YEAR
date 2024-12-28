import java.util.Scanner;
static Scanner sc=new Scanner(System.in);

static class Node{
    int data;
    Node next;
}

public class LinkedList {
    public static void main(String[] args) {

          Node head=null; //Initially LL is empty

          while(true)
          {
              System.out.println("ENTER YOUR CHOICE\n1.Create\n2.Insertion\n3.Deletion\n4.Traversal\n5.Reverse");
              int ch=sc.nextInt();
              switch(ch){
                  case 1:
                      head=create(head);
                      break;
                  default:
                      System.out.println("Invalid Input!! Try Again");
              }
          }
    }

    public static Node create(Node head)
    {
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
        
    }

}
