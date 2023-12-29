static int lenOfLL(Node head) {
        int len = 0;

        while(head != null) {
            len++;
            head = head.next;
        }

        return len;
    }

    static void printLL(Node head) {

        while(head != null) {
            System.out.print(head.data +" ");
            head = head.next;
        }
    }
    
    static void rotateRight(Node head, int k) {
        int len = lenOfLL(head);

        k = k % len;

        if(k == 0) {
            printLL(head);
            return ;
        }
        
        int step = len - k;

        Node temp = head;

        while(step > 1) {
            temp = temp.next;
            step--;
        }

        Node nn = temp.next;
        temp.next = null;

        temp = nn;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;

        head = nn;

        printLL(head);
        
        
    }
}
