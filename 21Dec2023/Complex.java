
class Complex {
    
    int real;
    int imag;
    
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }
    
    public String toString() {
        return real + " + " + imag +" i";
    }
    
    public Complex add(Complex other) {
        
        Complex out = new Complex(0, 0);
        
        out.real = this.real + other.real;
        out.imag = this.imag + other.imag;
        
        return out;
    }
    
    // subtract c1 - c2
    public Complex sub(Complex other) {
        
        Complex out = new Complex(0, 0);
        
        out.real = this.real - other.real;
        out.imag = this.imag - other.imag;
        
        return out;
    }
    
    public Complex mult(Complex other) {
        
        Complex out = new Complex(0, 0);
        
        out.real = this.real * other.real - this.imag * other.imag;
        out.imag = this.real * other.imag + this.imag * other.real;
        
        return out;
    }
    
    
    // Division : H W 
    
    
    
}


public class MyClass {
    public static void main(String args[]) {
      
      Complex c1 = new Complex(1, 2);
      Complex c2 = new Complex(3, 4);
      
      Complex c3 = c1.add(c2);
      
      Complex c4 = c1.sub(c2);
      
      Complex c5 = c1.mult(c2);
      
      System.out.println(c5); 
      
    }
}
