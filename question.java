public class complex {
    public static void main(String[] args) {
        Complex c1=new Complex(5,6);
        
        Complex c2=new Complex(7,8);
        c1.printComplex();
        c2.printComplex();
        Complex res=c1.add(c2);
        res.printComplex();
        Complex res2=c1.subtract(c2);
        res2.printComplex();
        Complex res3=c1.product(c2);
        res3.printComplex();
    }
}
class Complex {
    int real;
    int img;

    public Complex(int real, int img) {
        this.real=real;
        this.img=img;
    }

    public void printComplex() {
        if(this.img!=0) {
            System.out.println(this.real+" + i"+"("+this.img+")");
        }
        else {
            System.out.println(this.real);
        }
    }

    public Complex add(Complex c) {
        Complex result=new Complex(0,0);
        result.real=this.real+c.real;
        result.img=this.img+c.img;
        return result;
    }

    public Complex subtract(Complex c) {
        Complex result=new Complex(0,0);
        result.real=this.real-c.real;
        result.img=this.img-c.img;
        return result;
    }

    public Complex product(Complex c) {
        Complex result=new Complex(0,0);
        result.real=this.real*c.real - this.img*c.img;
        result.img=this.real*c.img+this.img*c.real;
        return result;
    }
}

