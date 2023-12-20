public class MyClass {
    public static void main(String args[]) {
        System.out.println("Start");
        
        try {
            int i = 10/0;
            int arr[] = new int[10];
            
            int c = arr[11];
        }
        catch(ArithmeticException ae) {
            
            System.out.println(ae);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            
        }catch(Exception e) {
            
            System.out.println(e);
        }
        
        System.out.println("End");
    }
}

/*

Start
java.lang.ArithmeticException: / by zero
End

*/

