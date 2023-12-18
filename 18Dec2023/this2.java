
class Test {
    int x;
    
    // Test(int x) {
    //     x = x;
    // }
    
    Test(int x) {
        this.x = x;
    }

}

public class MyClass {
    public static void main(String args[]) {
      
      Test t1 = new Test(10);
      System.out.println(t1.x);
      
    }
}
