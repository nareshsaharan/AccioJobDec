// https://course.acciojob.com/idle?question=191c3529-cb8b-4e23-bfbf-ff3d19f651ce

import java.io.*;
import java.util.*;

class Solution {

    public boolean helper(int arr[], int si, int x, int currSum, String curr) {

        //System.out.println(curr+" = "+currSum);
        
        if(currSum == x) {
            return true;            
        }
        
        if(si == arr.length) {
            return false;    
        }

        
        if(currSum > x) {
            return false;    
        }

        

        // pick
        boolean sa1 = helper(arr, si + 1, x, currSum + arr[si],   curr+" "+arr[si]);

        // not pick
        boolean sa2 = helper(arr, si + 1, x, currSum, curr);

        if(sa1 == true || sa2 == true) {
            return true;
        }

        return false;

        
    }

    
    public boolean targetSum(int si, int[] arr, int x) {


        return helper(arr, si, x, 0, "");



        
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.targetSum(0, arr, target));
        sc.close();
    }
}

