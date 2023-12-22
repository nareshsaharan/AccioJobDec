
class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
    }
}


public class MyClass {
    
    public static void main(String args[]) {
      
         Node one = new Node(1);
         Node two = new Node(2);
         Node three = new Node(3);
         
         one.next = two;
         two.next = three;
         
         System.out.println(one.next.next.data);
         
         //System.out.println(one.data +" "+ one.next);
         //System.out.println(two.data +" "+ two.next);
    }
}
