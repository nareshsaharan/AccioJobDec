
class A {
    
    static final int x;
    
    static {
        x = 10;
    }
    
    
 
     final void fun() {
         System.out.println("A");
     }   
}

class B extends A {
    
}

public class MyClass {
    public static void main(String args[]) {
        
        B b1 = new B();
        b1.fun();
    }
}
