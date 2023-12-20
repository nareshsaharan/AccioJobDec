class MyCustomException extends Exception {
    
    // custom message
    public MyCustomException(String message) {
        super(message);
    }
}

public class MyClass {
    
    static int divide(int a, int b) throws MyCustomException {
        
        if(b == 0) {
            throw new MyCustomException("Can not divide by zero");
        } 
        
        return a/b;
    }
    
    
    public static void main(String args[]) {
      
      try {
          
          int result = divide(10, 0);
      }
      catch(MyCustomException me) {
          System.out.println(me.getMessage());
      }
      
    }
}
