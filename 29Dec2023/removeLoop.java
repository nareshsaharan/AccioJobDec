public static void removeLoop(Node head){

        Node slow = head;
        Node fast = head;

        while(fast !=  null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                break;
            }
        }

        if(fast == null || fast.next == null) return ;

        Node start = head;
        Node prev = null;

        while(true) {
            
            prev = slow;
            slow = slow.next;
            start = start.next;
            
            if(start == slow) {
                prev.next = null;
                break;
            }
            
        }

    }
