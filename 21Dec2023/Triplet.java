import java.util.Scanner;

class Triplet {
    
    String name;
    int a;
    int b;
    
    public Triplet(String name, int a, int b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }
}



public class MyClass {
    
    public static Triplet fun() {
        
        Triplet t = new Triplet("Naresh", 10, -15);
        
        return t;
        
    }
    
    public static void main(String args[]) {
      
      Triplet out = fun();
      System.out.println(out.name+" +ve value: "+ out.a +" -ve value: "+ out.b);
      
      
    }
}
