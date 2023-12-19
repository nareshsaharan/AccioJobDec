
class A {
    
    A(int z){
        System.out.println("A");
    }
    
}

class B extends A {
    
    B(int y){
        super(10);
        System.out.println("B");
    }
    
    int t = 50;
    
    void fun(){
        System.out.println("fun");
    }
    
}

class C extends B {
    
    C(int x){
        super(10);
        System.out.println("Parent var: "+ super.t);
        super.fun();
        System.out.println("C");
    }
    
}


public class MyClass {
    public static void main(String args[]) {
        
        //B b1 = new B();
        C c1 = new C(10);
    }
}
