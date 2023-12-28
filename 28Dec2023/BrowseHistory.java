import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String homepage = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        BrowserHistory browserHistory = new BrowserHistory(homepage);
        for(int i = 0; i < n; i++) {
            String q = sc.nextLine();
            String[] query = q.split("\\s+");
            if(query[0].equals("visit")){
                browserHistory.visit(query[1]);
            } else if(query[0].equals("back")){
                browserHistory.back(Integer.parseInt(query[1]));
            } else if(query[0].equals("forward")){
                browserHistory.forward(Integer.parseInt(query[1]));
            }
        }
    }
}

class Node {
    String url;
    Node prev;
    Node next;

    Node(String url) {
        this.url = url;
    }
}

class BrowserHistory {
    
    Node head = null;
    Node curr = null;
    
    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        curr = head;
    }
    
    
    public void visit(String url) {
        
        Node nn = new Node(url);
        curr.next = nn;
        nn.prev = curr;
        curr = curr.next;
        
    }
    
    public void back(int steps) {

        while(steps-- > 0 && curr.prev != null) {
            curr = curr.prev;
        }

        System.out.println(curr.url);
        
    }
    
    public void forward(int steps) {
        
        while(steps-- > 0 && curr.next != null) {
            curr = curr.next;
        }

        System.out.println(curr.url);
        
    }
}
