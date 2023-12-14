import java.util.*;

public class Main {

    static int iDir[] = {0, 1, 1, 1, 0, -1, -1, -1};
    static int jDir[] = {1, 1, 0, -1, -1, -1, 0, 1};

    static boolean isSafe(int i, int j, int n, int m) {
        // safe cond
        if(i > n || j > m || i < 0 || j < 0) {
            return false;
        }

        return true;
    }
    
    static int countAllPath(int i, int j, int n, int m, boolean vis[][])
    {

        if(i == n && j == m) {
            return 1;
        }

        int ans = 0;

        for(int k = 0; k < 8; k++) {
            
            int newI = i + iDir[k];
            int newJ = j + jDir[k];
            if(isSafe(newI, newJ, n, m) && !vis[newI][newJ]) {
                vis[newI][newJ] = true;
                ans += countAllPath(newI, newJ, n, m, vis);
                vis[newI][newJ] = false;
            }
                  
        }

        return ans;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        
        boolean vis[][] = new boolean[n][m];
        vis[0][0] = true;
        System.out.println(countAllPath(0, 0, n-1,m-1, vis));
    }
}
