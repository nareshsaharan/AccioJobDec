import java.util.*;

public class Main {

    public static void helper(String s, String ans) {

        if(s.length() == 0) {
            System.out.println(ans);
            return ;
        }

        if(s.charAt(0) == '0') {
            return  ;    
        }
        
        if(s.length() == 1) {
            
            System.out.println(ans + (char)(s.charAt(0) - '0' + 96));
            return ;
        }

        helper(s.substring(1), ans + (char)(s.charAt(0) - '0' + 96));

        
        int curr = Integer.parseInt(s.substring(0, 2));
        
        if(curr >= 10 && curr <= 26)
            helper(s.substring(2), ans + (char)(curr + 96));
        
    }
    
    public static void printEncodings(String str) {

        helper(str, "");
		
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str);
    }
}
