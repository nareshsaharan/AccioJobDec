
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class Main {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int a1 = sc.nextInt();
        Node head = new Node(a1);
        addToTheLast(head);

        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            addToTheLast(new Node(a));
        }

        Solution abc=new Solution();
        Node node = abc.quickSort(head);

        printList(node);
        System.out.println();
    
        sc.close();
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
}

class Solution {


    static Node partition(Node start, Node end) {

        if(start == end || start == null || end == null) 
            return start;

        int pivotVal = end.data;
        Node prev = start; // i
        Node curr = start; // j
        Node prevSwap = start;

        while(curr !=  end) {

            if(curr.data < end.data) {
                
                prevSwap = prev;
                int temp = prev.data;
                prev.data = curr.data;
                curr.data = temp;

                prev = prev.next;
            }

            curr = curr.next;
            
        }

        int temp = prev.data;
        prev.data = end.data;
        end.data = temp;

        return prevSwap;
            
    }
    public static void quickSort(Node start, Node last) {

        // base case
        if(start == null || start == last || start == last.next) {
            return ;
        }

        Node prev = partition(start, last);
        quickSort(start, prev);

        if(prev != null && prev == start) {
            quickSort(prev.next, last);
        }else if(prev != null && prev.next != null) {
            quickSort(prev.next.next, last);
        }
        
    }
    
    public static Node quickSort(Node node)
    {
        Node last = node;
        while(last.next != null) last = last.next;

        quickSort(node, last);
        
        return node;
        
    }

}
