package AS1T6;

public class Complex{
    double real, img;
    Complex(double r, double i){
        this.real = r;
        this.img = i;
    }
    public static Complex Sum(Complex c1, Complex c2)
    {
        Complex temp = new Complex(0, 0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }
    public static Complex Difference(Complex c1, Complex c2)
    {
        Complex temp2 = new Complex(0, 0);
        temp2.real = c1.real - c2.real;
        temp2.img = c1.img - c2.img;
        return temp2;
    }
    public static Complex Product(Complex c1, Complex c2)
    {
        Complex temp3 = new Complex(0, 0);
        temp3.real = c1.real * c2.real;
        temp3.img = c1.img * c2.img;
        return temp3;
    }
    public static void main(String args[]) {
        Complex c1 = new Complex(5.5, 3.5);
        Complex c2 = new Complex(1.2, 4.5);
        Complex temp = Sum(c1, c2);
        System.out.println("Sum is: "+ temp.real+" + "+ temp.img +"i");
        Complex temp2 = Difference(c1, c2);
        System.out.println("Difference is: "+ temp2.real+" + "+ temp2.img +"i");
        Complex temp3 = Product(c1, c2);
        System.out.println("Product is: "+ temp3.real+" + "+ temp3.img +"i");
    }
}
