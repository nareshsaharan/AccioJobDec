public static int isPalindromic(int[] arr, int begin, int end) {

        if(begin > end) return 1;

        if(arr[begin] != arr[end]) {
            return 0;
        }

        return isPalindromic(arr, begin + 1, end - 1);
        
      
    }
