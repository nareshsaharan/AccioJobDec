
class Student {
    
    // variables:
    
    // public 
    public String name;
    
    // private 
    private int rollNum;
    
    // default
    String section;
    
    // functions:
    
    public void display() {
        System.out.println(name +" "+rollNum);
    }
    
    private void fun() {
        System.out.println(name +" "+rollNum);
    }
    
    
}

public class MyClass {
    public static void main(String args[]) {
      
        Student s1 = new Student();
        
        s1.name = "Ram";
        //s1.rollNum = 1;
        
        s1.section = "sec1";
        
        s1.display();
        s1.fun();
        
        Student s2 = new Student();
        
        s2.name = "Mohan";
        //s2.rollNum = 2;
        //System.out.println(s2.rollNum);
    }
}
