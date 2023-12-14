import java.util.*;
import java.io.*;

class Solution {


    static void merge(int arr[], int si, int mid, int ei) {

        int a1[] = new int[mid - si + 1];
        int b1[] = new int[ei - mid];

        int k = si;
        
        for(int i = 0; i < a1.length; i++) {
            a1[i] = arr[k];
            k++;
        }

        for(int j = 0; j < b1.length; j++) {
            b1[j] = arr[k];
            k++;
        }

        int i = 0;
        int j = 0;
        k = si;

        // till anyone array gets empty
        while(i < a1.length && j < b1.length) {

            if(a1[i] < b1[j]) {
                arr[k] = a1[i];
                i++;
                k++;
            }
            else {
                arr[k] = b1[j];
                j++;
                k++;
            }
            
        }


        // second array gets empty
        while(i < a1.length) {
            arr[k] = a1[i];
            i++;
            k++;
        }

        // first array gets empty
        while(j < b1.length) {
            arr[k] = b1[j];
            j++;
            k++;
        }
        

        
        
    }
    
static void mergeSort(int[] arr,int si,int ei){

        // base case
        if(si >= ei) {
            return ;
        }
    

        // find mid
        int mid = (si + ei) / 2;

        // make rec call
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for(int i= 0; i < n; i++)
            a[i] = input.nextInt();
        Solution Obj = new Solution();
        Obj.mergeSort(a,0,n-1);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
