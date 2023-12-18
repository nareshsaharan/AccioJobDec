
class Test {

    Test() {
        System.out.println("C");
    }
    
    {
        System.out.println("NB");
    }    
    
    
    static {
        System.out.println("S");
    }
}

public class MyClass {
    
    {
        System.out.println("NB");
    }    
    
    MyClass() {
        System.out.println("C");
    }
    
    static {
        System.out.println("S");
    }
    
    public static void main(String args[]) {
        
        System.out.println("M");
      //Test t1 = new Test();
    }
}
