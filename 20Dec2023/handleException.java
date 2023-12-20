public class MyClass {
    public static void main(String args[]) {
        System.out.println("Start");
        
        try {
            int a = 10;
            int b = 0;
            
            int x = a / b;
        }
        catch(Exception e) {
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

