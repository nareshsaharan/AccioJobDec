void deleteNode(Node node)
    {
        Node prev = node;
        while(node.next != null)
        {
            node.data = node.next.data;
            prev = node;
            node = node.next;
        }

        prev.next = null;
       
    }
