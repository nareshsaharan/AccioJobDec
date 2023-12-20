public class MyClass {
    public static void main(String args[]) {
        System.out.println("Start");
        
        int a = 10;
        int b = 0;
        
        int x = a / b;
        
        System.out.println("End");
    }
}
/*
Start

Exception in thread "main" java.lang.ArithmeticException: / by zero
	at MyClass.main(MyClass.java:8)
	
*/
