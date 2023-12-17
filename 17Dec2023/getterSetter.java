
class Student {
    
    private String name;
    private int rollNum;
    
    // getter & setter methods
    
    // getter : get value of rollNum
    public int getRollNum() {
        return this.rollNum;
    }
    
    // setter : set value of rollNum
    public void setRollNum(int rollNum) {
        
        if(rollNum <= 0) {
            this.rollNum = 1000;
            return ;
        }
        
        this.rollNum = rollNum;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    // class Dog { private String name, private String color, private int price }
    // getter name, color, price
    
    
    
}

public class MyClass {
    public static void main(String args[]) {
      
        Student s1 = new Student();
        //s1.rollNum = 10;
        
        s1.setRollNum(-10);
        
        System.out.println(s1.getRollNum());
        
    }
}
