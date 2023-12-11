static int countX(String str, int i, int n) {

        if(str.length() == 0) {

            return 0;
        }
        
        // rec Ans
        int recAns = countX(str.substring(1), i, n);

        if(str.charAt(0) == 'x') {
            return 1 + recAns;
        }else {
            return recAns;
        }
        

    }
