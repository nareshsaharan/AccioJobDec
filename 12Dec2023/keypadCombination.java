static String table[] = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    static ArrayList<String> helper(String s) {
        // "123"  -> "23"

        if(s.length() == 1){
            ArrayList<String> output = new ArrayList<>();

            String curr = table[Integer.parseInt(s.charAt(0)+"")];

            for(int i = 0; i < curr.length(); i++) {
                output.add(curr.charAt(i)+"");
            }

            return output;
        }
        
        
        ArrayList<String> recAns = helper(s.substring(1));
        String curr = table[Integer.parseInt(s.charAt(0)+"")];

        ArrayList<String> output = new ArrayList<>();

        for(int i = 0; i < curr.length(); i++) {

            for(int j = 0; j < recAns.size(); j++) {

                String sa = curr.charAt(i) + recAns.get(j);

                output.add(sa);
            }
        }

        return output;
        
    }
    
    static void printKPC(String ques) {

        ArrayList<String> ans = helper(ques);

        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
        
    }
