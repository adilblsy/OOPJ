import java.util.Scanner;

class DList {
   node head;

   class node {
      private int data;
      node right;
      node left;

      public node(int data) {
         this.data=data;
         this.right=null;
         this.left=null;
      }
   }

   public void insertAtEnd(int data) {
      node temp = new node(data);
      
      if(head == null) {
         head = temp;
      }
      else {
         node ptr = head;
         while(ptr.right != null) {
            ptr=ptr.right;
         }
         ptr.right = temp;
         temp.left = ptr;
      }
      System.out.println("\n"+data+" inserted");
      display();
   }

   public void deleteAtFront(){
      if(head == null) {
         System.out.println("\nList empty, cannot delete");
      }
      else if(head.right == null) {
         int data = head.data;
         head = null;
         System.out.println("\n"+data+" is deleted");
      }
      else {
         int data = head.data;
         head = head.right;
         head.left = null;
         System.out.println("\n"+data+" is deleted");
      }
      display();
   }

   public void display() {
      node temp = head;
      if(head == null) {
         System.out.println("\nThe list is empty");
      }
      else {
         System.out.print("\nList: ");
         while(temp != null) {
            System.out.print(temp.data+"\t");
            temp = temp.right;
         }
         System.out.println();
      }
   }
}

public class DLinkedList {
   public static void main(String [] args) {
      DList dl = new DList();
      int choice=0;
      while(choice!=4) {
         System.out.print("List Operations:\n1:Insert\n2:Delete\n3:Display\n4:Exit\nChoose: ");
         Scanner sc = new Scanner(System.in);
         choice = sc.nextInt();
         sc.nextLine();

         switch(choice) {
         case 1: System.out.print("Enter the element: ");
                 int data = sc.nextInt();
                 sc.nextLine();
                 dl.insertAtEnd(data);
                 break;
         case 2: dl.deleteAtFront();
                 break;
         case 3: dl.display();
                 break;
         case 4: break;
         default: System.out.print("Invalid choice");
         }
         System.out.println();
      }
   }
}