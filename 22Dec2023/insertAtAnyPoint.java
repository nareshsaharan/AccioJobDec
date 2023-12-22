static Node insert(Node head, int n, int pos, int val) {
         
        Node nn = new Node(val);
        if(pos == 0) {
            nn.next = head;
            head = nn;

            return head;
        }

        Node prev = null;
        Node curr = head;

        while (pos-- > 0) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = nn;
        nn.next = curr;

        return head;
        
        
    }
