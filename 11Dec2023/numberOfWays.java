import java.io.*;
import java.util.*;
public class Main {
    public static long ways(int n, int start, int curr){
        
        if(curr == n) {
            //System.out.println(path);
            return 1;
        }

        if(start > n || curr > n) {
            return 0;
        }


        // pick
        long sa1 = ways(n, start + 1, curr + start);

        // not pick
        long sa2 = ways(n, start + 1, curr);

        return sa1 + sa2;

        
    }

    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(ways(n, 1, 0));
    }
}
