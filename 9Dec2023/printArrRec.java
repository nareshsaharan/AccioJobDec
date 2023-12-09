public static void PrintReverseArray(int[] arr, int ei) {

        if(ei == -1) {
            return ;
        }

        System.out.print(arr[ei] +" ");

        PrintReverseArray(arr, ei - 1);
    }
