import java.util.*;
import java.io.*;


class Pair{
    Node head;
    Node tail;

    Pair(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }
}


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}
public class Main {

    static Node revUsingRec(Node head) {

        if(head.next == null) {
            return head;
        }


        Node recHead = revUsingRec(head.next);
        Node temp = recHead;

        while(temp.next != null) {
            temp = temp.next;
        }
        
        temp.next = head;
        head.next = null;

        return recHead;
    
        
    }

    static Pair rec2(Node head) {

        if(head.next == null) {
            Pair ans = new Pair(head, head);
            return ans;
        }
        
        Pair recAns = rec2(head.next);

        recAns.tail.next = head;
        head.next = null;

        Pair ans = new Pair(recAns.head, head);

        return ans;
        
    }


    static Node rec3(Node head) {

        Node prev = null;
        Node curr = head;

        while(curr != null) {
    
            Node next = curr.next;
            // bond
            curr.next = prev;

            // change the values
            prev = curr;
            curr = next;
            
        }

        return prev;
    }
    public static void reverse(Node curr){
        
        Node head = rec3(curr);

        // Pair ans = rec2(curr);
        // Node head = ans.head;

        while(head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            list.add(x);
        }
        reverse(list.head);
        System.out.println("");
    }
}
