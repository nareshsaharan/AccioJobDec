public static int fib(int n ){

        if(n == 1) {
            return 0;
        }

        if(n == 2) {
            return 1;
        }

        int fib_n_1 = fib(n-1);
        int fib_n_2 = fib(n-2);

        int myAns = fib_n_1 + fib_n_2;

        return myAns;
    }
