public static void remove(LinkedList ll, int toRemove){


        Node head = ll.head;

        Node prev = null;
        Node curr = head;

        if(toRemove == 0) {
            ll.head = curr.next;
            return;
        }

        while(toRemove-- > 0) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;


        
        




        
    }
