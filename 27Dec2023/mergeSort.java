import java.util.*;

class Solution {

    static Node merge(Node t1, Node t2){
    
     Node head = null, prev = null;

     if(t1.data < t2.data) {
         head = t1;
         prev = t1;
         t1 = t1.next;
     }else {
         head = t2;
         prev = t2;
         t2 = t2.next;
     }

     

     while(t1 != null && t2 != null) {

         if(t1.data < t2.data) {
             prev.next = t1;
             prev = prev.next;
             t1 = t1.next;
         }else {
             prev.next = t2;
             prev = prev.next;
             t2 = t2.next;
         }
         
     }

     if(t1 != null) {
         prev.next = t1;
     }else {
         prev.next = t2;
     }

     return head;
     
    }


    public static Node findMid(Node head) {

        Node fast = head;
        Node slow = head;

        while( fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    
    public static Node mergesort(Node head){

        if(head == null || head.next == null) {
            return head;
        }

        Node mid = findMid(head);
        Node nextOfMid = mid.next;
        mid.next = null;

        Node left = mergesort(head);
        Node right = mergesort(nextOfMid);

        Node ans = merge(left, right);
        return ans;
        

    }
}


class Node{
    int data;
    Node next = null;
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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        LinkedList a = new LinkedList();
        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }
        Solution Obj = new Solution();
        a.head = Obj.mergesort(a.head);
        Node h = a.head;
        while(h != null){
            System.out.print(h.data + " ");
            h = h.next;
        }
    }
}

