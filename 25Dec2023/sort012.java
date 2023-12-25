static void unfold(Node head)
    {
        int countZero=0, countOne=0, countTwo=0;

        Node temp = head;

        while(temp != null) {

            if(temp.data == 0) countZero++;
            else if(temp.data == 1) countOne++;
            else countTwo++;

            temp = temp.next;
        }

        temp = head;

        while(countZero-- > 0) {
            temp.data = 0;
            temp = temp.next;
        }

        while(countOne-- > 0) {
            temp.data = 1;
            temp = temp.next;
        }

        while(countTwo-- > 0) {
            temp.data = 2;
            temp = temp.next;
        }

        printLL(head);

        
    }
