static String PairStar(String str) {

        if(str.length() == 1) {
            return str;
        }

        String recAns = PairStar(str.substring(1));

        if(str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + recAns;
        }
        else
        {
            return   str.charAt(0) + recAns;  
        }
        
    }
