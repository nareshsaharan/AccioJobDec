
class Student {
    
    String name;
    int rollNum;
    
}

public class MyClass {
    public static void main(String args[]) {
      
        Student s1 = new Student();
        
        s1.name = "Ram";
        s1.rollNum = 1;
        
        Student s2 = new Student();
        
        s2.name = "Mohan";
        s2.rollNum = 2;
        System.out.println(s2.rollNum);
    }
}
