 public static DoublyLinkedList deleteNodeWithX(DoublyLinkedList linkedList, int x){
        //Write your code here
        Node head = linkedList.head;
        Node curr = head;

        while(curr != null) {
            
            // head
            if(curr.val == x && curr.prev == null) {
                linkedList.head = curr.next;
                linkedList.head = null;
            }
            // tail
            else if(curr.val == x && curr.next == null) {
                curr.prev.next = null;
                linkedList.tail = curr.prev;
            }
            // middle 
            else if(curr.val == x){
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
            }

            curr = curr.next;

        }

        return linkedList;
        
    }
