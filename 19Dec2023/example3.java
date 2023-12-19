class Parent {
    
    int x = 10;
    
    void fun() {
        System.out.println("A");
    }
}

class Child extends Parent{
    
    int y = 20;
    
    void fun() {
        System.out.println("B");
    }
}
public class MyClass {
    public static void main(String args[]) {
        
        Parent p = new Child();
        System.out.println(p.x + p.y);
        
        
    }
}
