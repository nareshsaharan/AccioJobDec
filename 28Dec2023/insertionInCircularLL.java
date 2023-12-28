
import java.util.*;
import java.io.*;

class Node {
    
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Main {


    static void printLL(Node head) {
        System.out.print(head.data+" ");
        Node curr = head.next;

        while(curr != head) {
            System.out.print(curr.data +" ");
            curr = curr.next;
        }
    }

    static Node insertAtEnd(Node head, int x) {

        Node curr = head;

        while(curr.next != head) {
            curr = curr.next;
        }

        curr.next = new Node(x);
        curr.next.next = head;
        return head;
    }
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       
        Node head = null;
        Node temp = null;
        while(n-- > 0) {
            Node nn = new Node(s.nextInt());

            if(head == null) {
                head = nn;
                temp = nn;
            }else {
                temp.next = nn;
                temp = temp.next;
            }
            
        }
        temp.next = head;
        int x = s.nextInt();
        
        head = insertAtEnd(head, x);

        printLL(head);
        
    }
}
