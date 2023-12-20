
abstract class Bird {
    
    // non abstract
    public void flying() {
        System.out.println("Bird is flying");
    }
    
    // abstract (only decleration is there)
    abstract public void singing();
}


class Hummingbird extends Bird {
    
    public void singing() {
        System.out.println("Bird is singing");
    }
}

public class MyClass {
    public static void main(String args[]) {
        //Bird b = new Bird();
        
        
      
    }
}
