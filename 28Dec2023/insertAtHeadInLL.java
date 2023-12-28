static Node insertAtHead(Node head,int K) {
        Node nn = new Node(K);

        nn.next = head;
        head.prev = nn;
        head = nn;

        return head;
    }
