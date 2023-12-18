class A {
    
    static int x = 10;
    private void fun() {
        System.out.println("A");
    }
}

class B extends A {
    
}

public class MyClass {
    public static void main(String args[]) {
        B b1 = new B();
        System.out.println(b1.x);
    }
}
