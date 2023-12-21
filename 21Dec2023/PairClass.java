import java.util.Scanner;

class Pair {
    
    String first;
    int second;
    
    public Pair(String first, int second) {
        this.first = first;
        this.second = second;
    }
}



public class MyClass {
    
    public static Pair findAverage(String name, int marks[]) {
        
        int sum = 0;
        
        for(int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        
        int avg = sum / marks.length;
        
        Pair p = new Pair(name, avg);
        
        return p;
        
        
    }
    
    public static void main(String args[]) {
      
      Scanner s = new Scanner(System.in);
      
      String name = s.next();
      int n = s.nextInt();
      int arr[] = new int[n];
      
      for(int i = 0; i < n; i++) {
          arr[i] = s.nextInt();
      }
      
      Pair out = findAverage(name, arr);
      
      System.out.println(out.first+" have avg marks : " + out.second);
      
      
    }
}
