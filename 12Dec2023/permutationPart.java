import java.util.*;
  
public class Main{
  
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String s=scn.nextLine();
      String asf="";
      permutationPrint(s,asf);
   }


    static ArrayList<String> helper(String s) {

        if(s.length() == 1) {
            ArrayList<String> output = new ArrayList<String>();
            output.add(s);
            return output;
        }

        // recAns
        ArrayList<String> recAns = helper(s.substring(1));

        ArrayList<String> output = new ArrayList<String>();

        for(int i = 0; i < recAns.size(); i++) {
            String curr = recAns.get(i);

            for(int j = 0; j <= curr.length(); j++) {
                String sa = curr.substring(0, j) + s.charAt(0) + curr.substring(j);
                output.add(sa);
            }
        }

        return output;
        
    }

    
   public static void permutationPrint(String ques, String asf)
   {
        ArrayList<String> ans = helper(ques);

       Collections.sort(ans);

       for(int i = 0; i < ans.size() - 1; i++) {
           
           if(!ans.get(i).equals(ans.get(i+1))) {
               System.out.println(ans.get(i));
           }
               
       }

       System.out.println(ans.get(ans.size()-1));

       

       
        
   }
  }
