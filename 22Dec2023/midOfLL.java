static int LenOfLL(Node head) {

        int cnt = 0;
        while(head != null) {
            head = head.next;
            cnt++;
        }
        return cnt;
        
    }

    static Node midpointOfLinkedList(Node head)
    {
        int len = LenOfLL(head);

        int skip = len / 2;

        while(skip-- > 0) {
            head = head.next;
        }

        return head;
        
        
    }
