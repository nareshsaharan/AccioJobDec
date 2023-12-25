public Node rearrangeList(Node head) {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        Node temp = head;
        
        while(temp != null) {
            if(temp.val % 2 == 0) {
                even.add(temp.val);
            }else{
                odd.add(temp.val);
            }

            temp = temp.next;
        }
        temp = head;
        for(int i = 0; i < even.size(); i++) {
            temp.val = even.get(i);
            temp = temp.next;
        }
        
        for(int i = 0; i < odd.size(); i++) {
            temp.val = odd.get(i);
            temp = temp.next;
        }

        return head;
        
        
    }
