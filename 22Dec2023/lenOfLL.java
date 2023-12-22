import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
    }
}




public class MyClass {
    
    
    public static void printLL(Node head) {
        
        while(head != null) {
            
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
    public static int lenOfLL(Node head) {
        
        int cnt = 0;
        while(head != null) {
            cnt++;
            head = head.next;
        }
        
        return cnt;
    }
    
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
         
         //printLL(head);
         System.out.println(lenOfLL(head));
        //  // 
        //  System.out.println(head.next.next.next.next.data);
         
         
    }
}
