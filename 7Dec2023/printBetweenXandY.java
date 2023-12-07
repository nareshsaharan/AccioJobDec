public static void printXY(int x,int y){

        if(x == y) {
            System.out.print(x +" ");
            return ;
        }

        printXY(x, y - 1);

        System.out.print(y +" ");
    }
