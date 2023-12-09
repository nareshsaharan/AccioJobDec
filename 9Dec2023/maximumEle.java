public static int maxElement(int[] arr, int si){

        if(si == arr.length - 1)
        return arr[arr.length - 1];
        

        int recAns = maxElement(arr, si + 1);

        int myAns = Math.max(recAns, arr[si]);

        return myAns;
    }
