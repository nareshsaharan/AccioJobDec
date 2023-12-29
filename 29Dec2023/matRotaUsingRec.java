void helper(int mat[][], int i, int j) {

        if(i == -1) {
            i = mat.length - 1;
            j = j + 1;
            System.out.println();
        }

        if(j == mat[0].length ) return ;

        System.out.print(mat[i][j]+" ");
        
        helper(mat, i - 1, j);
    }
    public void MatRotateRecur(int[][] mat) {

        helper(mat, mat.length - 1, 0);

    }
}

