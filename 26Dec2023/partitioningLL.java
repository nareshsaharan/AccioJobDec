public void printLL(Node head) {

        while(head != null) {
            System.out.print(head.data +" ");
            head = head.next;
        }
    }
    
    public void partition(Node head, int x) {

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        Node temp = head;
        while(temp != null) {
            
            if(temp.data < x) {
                left.add(temp.data);
            }   
            else {
                right.add(temp.data);
            }
            temp = temp.next;
        }

        temp = head;

        for(int i = 0; i < left.size(); i++) {
            temp.data = left.get(i);
            temp = temp.next;
        }

        for(int i = 0; i < right.size(); i++) {
            temp.data = right.get(i);
            temp = temp.next;
        }

        printLL(head);
        
    }
