static void printNTo1(int n) {
        
        if(n == 1) {
            System.out.println(1);
            return ;
        }
        
        System.out.println(n);
        
        printNTo1(n - 1);
    }
