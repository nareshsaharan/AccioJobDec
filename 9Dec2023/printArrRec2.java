public static void PrintArray(int[] arr, int n) {
            if(ei == -1) {
            return ;
        }

        
        PrintArray(arr, ei - 1);

        System.out.print(arr[ei] + " ");
}
