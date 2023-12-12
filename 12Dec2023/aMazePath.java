public static void aMazePaths(int n, int m, String psf,int i , int j){

        // safe condi 
        if(i > n || j > m) {
            return ;
        }

        // base case
        if(i == n && j == m) {
            System.out.println(psf);
        }
        
        // move hori
		aMazePaths(n, m, psf + "h", i, j + 1);

        // move veri
        aMazePaths(n, m, psf + "v", i + 1, j);
		
		
    }
	
