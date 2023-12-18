class Employee {
    
    String firstName;
    String lastName;
}

class Engineer extends Employee {
    
}

class Manager extends Employee {
    
}



public class MyClass {
    public static void main(String args[]) {
        Engineer e1 = new Engineer();
        e1.firstName = "Naresh";
        e1.lastName = "Saharan";
        
        System.out.println(e1.firstName +" "+e1.lastName);
    }
}
