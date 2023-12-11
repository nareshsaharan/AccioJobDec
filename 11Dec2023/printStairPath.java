static void helper(int n, int start, String currPath) {

        if(start > n) {
            return ;
        }

        if(start == n) {
            System.out.println(currPath);
            return ;
        }

        
        // 1 step
        helper(n, start + 1, currPath + "1");
        
        // 2 step
        helper(n, start + 2, currPath + "2");
        
        // 3 step
        helper(n, start + 3, currPath + "3");
        
    }
