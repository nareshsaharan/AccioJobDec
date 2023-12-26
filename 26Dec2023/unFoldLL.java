import java.io.*;
import java.util.*;
 
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
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
    static void unfold1(Node head)
    {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        Node temp = head;

        while(temp != null && temp.next != null) {
            al1.add(temp.data);
            temp = temp.next;
            al2.add(temp.data);
            temp = temp.next;
        }

        for(int i = 0; i < al1.size(); i++) {
            System.out.print(al1.get(i)+" ");
        }

        for(int i = al2.size() - 1; i >= 0; i--) {
            System.out.print(al2.get(i)+" ");
        }
        
    }

    static Node reverse(Node head) {

        Node curr = head;
        Node prev = null;

        while(curr != null) {

            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
        
    }

    static void printLL(Node head) {

        while(head != null) {
            System.out.print(head.data +" ");
            head = head.next;
        }
    }

    static void unfold(Node head)
    {
        Node l1 = head;
        Node l2 = head.next;
        Node temp = l2;

        while(l2 != null && l2.next != null) {
            l1.next = l1.next.next;
            l2.next = l2.next.next;
            l1 = l1.next;
            l2 = l2.next;
            
        }

        Node l2Rev = reverse(temp);

        l1.next = l2Rev;

        printLL(head);
        
        
    }
}
public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        Solution Ob = new Solution();
        Ob.unfold(l1.head);
    }
}
