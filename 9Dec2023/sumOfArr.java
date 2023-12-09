public static int sumofArrayRec(int[] arr, int si) {

        if(si == arr.length) {
            return 0;
        }

        int recAns = sumofArrayRec(arr, si + 1);
        int myAns = arr[si] + recAns;

        return myAns;
    }
