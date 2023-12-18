
class Test {
    
    static class InnerClass {
        
    }
    
    static int x = 1;
    int y = 1;
    
    Test() {
        x++;
        y++;
    }
    
    static {
        
    }
    
    static void fun() {
        System.out.println("there");
    }
    
}


public class MyClass {
    
    public static void main(String args[]) {
        
        System.out.println(Test.x);
        
        Test.fun();
        
    //   Test t1 = new Test();
    //   Test t2 = new Test();
      
    //   System.out.println(t1.x +" "+t1.y);
      
    }
}
