static void print1ToN(int n) {
        
        if(n == 1) {
            System.out.println(1);
            return ;
        }
        
        print1ToN(n - 1);
        
        System.out.println(n);
    }
