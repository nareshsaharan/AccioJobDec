static int addNum(int n) {
        
        if(n == 1){
            
            return 1;
        }
    
        int recAns = addNum(n-1);
        
        int myAns = recAns + n;
        return myAns;
    }
