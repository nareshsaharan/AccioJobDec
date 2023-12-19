class Parent {
    
    void fun() {
        System.out.println("A");
    }
}

class Child extends Parent{
    
    void fun() {
        System.out.println("B");
    }
}
public class MyClass {
    public static void main(String args[]) {
        
        Parent p = new Child();
        p.fun();
        
        //Child c = new Parent();
    }
}
