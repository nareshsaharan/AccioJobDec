class A {
    
    void fun() {
        System.out.println("A");
    }
}

class B extends A{
    
    void fun() {
        System.out.println("B");
    }
}
public class MyClass {
    public static void main(String args[]) {
        B b1 = new B();
        b1.fun();
    }
}
