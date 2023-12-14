static int partitionAlgo(int arr[], int si, int ei) {

            int lastEle = arr[ei];
            int i = si - 1;

            for(int j = si; j < ei; j++) {

                if(arr[j] < lastEle) {
                    i++;

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                
            }

            i++;
            int temp = arr[ei];
            arr[ei] = arr[i];
            arr[i] = temp;
           
           return i;

           
       }

        static void helper(int arr[], int si, int ei) {

            // base case

            if(si >= ei) {
                return ;
            }
            
            int parIdx = partitionAlgo(arr, si, ei);
            helper(arr, si, parIdx - 1);
            helper(arr, parIdx + 1, ei);

        }
    
       static int[] quickSort(int a[], int n)
        {
            helper(a, 0, n - 1);
            return a;
        } 
