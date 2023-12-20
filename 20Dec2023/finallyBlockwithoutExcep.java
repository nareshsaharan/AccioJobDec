public class MyClass {
    public static void main(String args[]) {
        
        
        try {
            
            System.out.println("1");
            int arr[] = new int[10];
            int c = arr[5];
            System.out.println("2");
        }
        catch(Exception e) {
            System.out.println("3");
        }
        finally {
            System.out.println("4");
        }
        
        System.out.println("5");
    }
}

/*

Start
java.lang.ArithmeticException: / by zero
End

*/

