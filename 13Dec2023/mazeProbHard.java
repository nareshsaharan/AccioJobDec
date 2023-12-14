import java.io.*;
import java.util.*;

public class Main {
	public static void printMazePaths(int i, int j, int n, int m, String psf) {

        // safe
        if(j > m || i > n){
            return ;
        }
        
        // base case
        if(i == n && j == m) {
            System.out.println(psf);
            return;
        }


        for(int x = 1; x <= m; x++) {
            // hori
            printMazePaths(i, j + x, n, m, psf + "h" + x);
        }
        

        for(int y = 1; y <= n; y++) {
            //vert
            printMazePaths(i + y, j , n, m, psf + "v" + y);
        }
        

        for(int d = 1; d <= Math.min(n, m); d++) {
            // dia
            printMazePaths(i + d, j + d, n, m, psf + "d" + d);
        }
        

        
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        printMazePaths(0, 0, n - 1, m - 1, "");
    }
}
