// nth -> 4 * (n-1) + (n-2) 
    // 2  8    34   144 ... 
	static long NthEvenFibonacci(long n) {

        if(n == 1) return 2;
        if(n == 2) return 8;

        long nthEven = 4 * NthEvenFibonacci(n-1) + NthEvenFibonacci(n-2);
        long mod = (long)(Math.pow(10, 9) + 7);

        nthEven = nthEven % mod;

        return nthEven;
        
    }
