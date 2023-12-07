public static long xPowerN(int x, int n){

        if(n == 1) {
            return x;
        }
        
        long recAns = xPowerN(x, n - 1);

        long myAns = recAns * x;

        return myAns;
		
	}
