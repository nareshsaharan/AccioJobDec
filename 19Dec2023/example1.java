public class MyClass {
    
    static float add(int a, float b) {
        return a - b;
    }
    
    static float add(int a, int b) {
        return a + b;
    }
    
    public static void main(String args[]) {
        System.out.println(add(10, 2.5f));
    }
}
