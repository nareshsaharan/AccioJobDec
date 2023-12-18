
class Test {
    
    Test() {
        System.out.println("This is: "+ this);
    }
}

public class MyClass {
    public static void main(String args[]) {
      Test t1 = new Test();
      System.out.println("T1 is: "+ t1);
      
      Test t2 = new Test();
      System.out.println("T2 is: "+ t2);
      
    }
}
