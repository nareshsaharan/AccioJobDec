static Node merge(Node t1, Node t2){
    
     Node head = null, prev = null;

     if(t1.data < t2.data) {
         head = t1;
         prev = t1;
         t1 = t1.next;
     }else {
         head = t2;
         prev = t2;
         t2 = t2.next;
     }

     

     while(t1 != null && t2 != null) {

         if(t1.data < t2.data) {
             prev.next = t1;
             prev = prev.next;
             t1 = t1.next;
         }else {
             prev.next = t2;
             prev = prev.next;
             t2 = t2.next;
         }
         
     }

     if(t1 != null) {
         prev.next = t1;
     }else {
         prev.next = t2;
     }

     return head;


     

     
    }
}
