import java.util.*;

// Java program for flattening a Linked List
public class Main {

  /* Linked list Node*/
  static class Node {

    int data;
    Node right, down;

    Node(int data) {
      this.data = data;
      right = null;
      down = null;
    }
  }

  static Node flatten(Node root) {

      ArrayList<Node> al = new ArrayList<>();

      Node temp = root;

      while(temp != null) {
          al.add(temp);
          temp = temp.right;
      }
      
      Node head = null;
      temp = null;
      
      while(true) {

          int minVal = Integer.MAX_VALUE;
          int minIdx = -1;
          for(int i = 0; i < al.size(); i++) {

              if(al.get(i) != null) {
                  
                  if(minVal > al.get(i).data) {
                      minVal = al.get(i).data;
                      minIdx = i;
                  }
                  
              }
          }

          if(minVal == Integer.MAX_VALUE) {
              break;
          }
          
          al.set(minIdx, al.get(minIdx).down);

          if(head == null) {
              head = new Node(minVal);
              temp = head;
          }else {
              temp.down = new Node(minVal);
              temp = temp.down;
          }
      }

      return head;
        
  }

static void printList(Node head) {
        
        while(head != null) {
            System.out.print(head.data+" ");
            head = head.down;
        }
        
        System.out.println();
  }

  public static boolean isCorrect(Node claim) {
    if (claim.right != null) return false;
    Node copy = claim;
    while (copy.down != null) {
      if (copy.down.data < copy.data) return false;
      copy = copy.down;
    }
    return true;
  }

  // Driver's code
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Node ll = new Node(-1), prev1 = null, head = ll;
    for (int i = 0; i < n; i++) {
      int k = sc.nextInt();
      Node prev2 = null, copy = ll;
      while (k-- != 0) {
        int val = sc.nextInt();
        copy.data = val;
        copy.down = new Node(-1);
        prev2 = copy;
        copy = copy.down;
      }
      prev2.down = null;
      ll.right = new Node(-1);
      prev1 = ll;
      ll = ll.right;
    }
    sc.close();
    prev1.right = null;
    Node flattenedNode = flatten(head);
    printList(flattenedNode);
    if (isCorrect(flattenedNode)) System.out.println(
      "yes"
    ); else System.out.println("no");
  }
}
