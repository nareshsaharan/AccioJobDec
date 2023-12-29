Node swapkthnode(Node head, int len, int k)
    {
        if(k > (len/2 + 1)) {
            k = len - k + 1;
        }

        if(k == (len/2 + 1)) {
            if(len % 2 != 0) {
                return head;
            }else {
                k = len/2;
            }
        }


        // alternative
        if(k == len/2 && (len %2 == 0)) {
            // len == 2
            if(len == 2) {
                Node temp = head.next;
                temp.next = head;
                head.next = null;
                head = temp;
    
            }else {

                Node fprev = null;
                Node fcurr = head;

                while(k > 1) {
                    fprev = fcurr;
                    fcurr = fcurr.next;
                    k--;
                }
                Node scurr = fcurr.next;
                Node snext = scurr.next;

                fprev.next = scurr;
                scurr.next = fcurr;
                fcurr.next = snext;
                
                
            }
        }
        // first and last
        else if(k == 1) {
            Node fcurr = head;
            Node fnext = head.next;

            Node scurr = head;
            Node sprev = null;

            while(scurr.next != null) {
                sprev = scurr;
                scurr = scurr.next;
            }

            sprev.next = fcurr;
            fcurr.next = null;
            scurr.next = fnext;
            head = scurr;

            
        }
        // case anywhere
        else {
            
            int cnt = k;
            Node fprev = null;
            Node fcurr = head;

            while(cnt > 1) {
                fprev  =fcurr;
                fcurr  = fcurr.next;
                cnt--;
            }

            k = len - k;
            Node scurr = head;
            Node sprev = null;
            while(k > 0) {
                sprev = scurr;
                scurr = scurr.next;
                k--;
            }

            Node snext = scurr.next;


            fprev.next = scurr;
            scurr.next = fcurr.next;
            sprev.next = fcurr;
            fcurr.next = snext;
               
        }

        return head;

        

        
    }
