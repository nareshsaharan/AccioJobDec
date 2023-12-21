class Fraction {
    
    private int num;
    private int deno;
    
    public Fraction(int num, int deno) {
        this.num = num;
        this.deno = deno;
    }
    
    public int getNum() {
        return this.num;
    } 
    
    public void setNum(int num) {
        this.num = num;
    }
    
    public int getdeno() {
        return this.deno;
    } 
    
    public void setDeno(int deno) {
        this.deno = deno;
    }
    
    
    public Fraction add(Fraction other) {

        Fraction f3 = new Fraction(0, 0);
        
        // cross multi
        f3.num = this.num * other.deno + this.deno * other.num;
        f3.deno = this.deno * other.deno;
        
        
        // hcf log(n)
        // int hcf = 1;
        // for(int i = 1; i <= Math.min(f3.num, f3.deno); i++) {
        //     if(f3.num % i == 0 && f3.deno % i == 0) {
        //         hcf = i;
        //     }
        // }
        
        int hcf = findHcf(f3.num, f3.deno);
        
        f3.num = f3.num / hcf;
        f3.deno = f3.deno / hcf;
        
        return f3;
        
    }
    
    // rec O(log n)
    public int findHcf(int a, int b) {
        
        if(a == 0) return b;
        if(b == 0) return a;
        
        return findHcf(b % a, a);
    }
    
    public String toString() {
        
        return num +"/" + deno;
    }
    
    
}

public class MyClass {
    
    // public static int findHcf(int a, int b) {
        
    //     if(a == 0) return b;
    //     if(b == 0) return a;
        
    //     return findHcf(b % a, a);
    // }
    
    
    public static void main(String args[]) {
        
        //System.out.println(findHcf(12, 40));
      
      Fraction f1 = new Fraction(1, 10);
      Fraction f2 = new Fraction(4, 20);
      Fraction f3 = f1.add(f2);
      System.out.println(f3);
    }
}
