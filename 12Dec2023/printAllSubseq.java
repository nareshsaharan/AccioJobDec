static void helper(String s, String ans, int si) {

        if(si == s.length()) {
            System.out.print(ans+" ");
            return;
        }

        // pick
        helper(s, ans + s.charAt(si), si + 1);

        // not pick
        helper(s, ans , si + 1);
    } 
    
    static void printSubsequence(String s) {
        helper(s, "", 0);
    }
