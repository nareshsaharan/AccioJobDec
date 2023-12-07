public static long power(int x, int y)
    {

        if(y == 0) {
            return 1;
        } 

        if(y == 1) {
            return x;
        }

        long recAns = power(x, y/2);

        if(y % 2 == 0) {
            return recAns * recAns;
        }else {
            return recAns * recAns * x;
        }
         
    }
