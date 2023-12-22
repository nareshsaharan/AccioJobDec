import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
    }
}


public class MyClass {
    
    public static void main(String args[]) {
      
         Scanner s = new Scanner(System.in);
         int n = s.nextInt();
         
         Node head = null;
         Node temp = null;
         
         for(int i = 0; i < n; i++) {
             
             int currData = s.nextInt();
             
             //newNode;
             Node nn = new Node(currData);
             
             if(head == null) {
                 head = nn;
                 temp = nn;
             }
             else 
             {
                 temp.next = nn;
                 temp = temp.next;
             }
         }
         
         System.out.println(head.next.next.data);
         
         
    }
}
