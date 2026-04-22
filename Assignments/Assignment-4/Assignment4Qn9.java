class Complex {
    int real;
    int imag;

    Complex(int real, int imag){
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex c){
        return new Complex(real + c.real, imag + c.imag);
    }

    Complex subtract(Complex c){
        return new Complex(real - c.real, imag - c.imag);
    }

    void display(){
        System.out.println(real + " + " + imag + "i");
    }
}

public class Assignment4Qn9 {
    public static void main(String[] args){
        Complex c1 = new Complex(4,3);
        Complex c2 = new Complex(2,5);

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);

        System.out.print("Addition: ");
        sum.display();

        System.out.print("Subtraction: ");
        diff.display();
    }
}