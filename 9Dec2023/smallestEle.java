public static int recforMin(int[] arr, int idx) {


        if(idx == arr.length - 1) return arr[idx];
        
        int recAns = recforMin(arr, idx + 1);
        int myAns = Math.min(recAns, arr[idx]);

        return myAns;
    }
