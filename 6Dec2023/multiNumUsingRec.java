// To find  multiplication of fist N
    static int multi(int n) {
        
        // base case
        if(n == 1)  {
            return 1;
        }
        
        // rec Ans
        int recAns = multi(n-1);
        
        // my Ans
        int myAns = recAns * n;
        return myAns;
     
