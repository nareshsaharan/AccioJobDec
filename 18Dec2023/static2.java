
public class MyClass {
    
    //static int i;
    
    int i;
    
    public void fun() {
        System.out.println("Fun");
    }
    
    public static void main(String args[]) {
        
        MyClass o1 = new MyClass();
        o1.fun();
        System.out.println(o1.i);
        //fun();
        //System.out.println(i);
        
    }
}
