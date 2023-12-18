
class Test {
    
    
    Test(int x) {
        System.out.println("P");
        this();
    }
    
    Test() {
        this(10);
        System.out.println("D");
    }
}

public class MyClass {
    
    public static void main(String args[]) {
     
      Test t1 = new Test(10);
      
      
    }
}
