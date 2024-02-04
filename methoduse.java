/* How to use Methods in Java */
import java.util.Scanner;
class Fun
{
    int n1,n2; int add,sub,multi,div,rem;
    public static void main(String[] args) {
    Fun ref=new Fun();
    ref.input();
    ref.process();
    ref.output();
    
    }
    void input()
    {
        Scanner r=new Scanner(System.in);
       System.out.print("Enter Two Numbers: "); 
       n1=r.nextInt();
       n2=r.nextInt();
    }
    void process()
    {
        add=n1+n2;
        sub=n1-n2;
        multi=n1*n2;
        div=n1/n2;
        rem=n1%n2;
    }
    void output()
    {
        System.out.println("Sum of two Numbers: "+add);
        System.out.println("Sub of two Numbers: "+sub);
        System.out.println("Multi of two Numbers: "+multi);
        System.out.println("Div of two Numbers: "+div);
        System.out.println("Rem of two Numbers: "+rem);

    }
}
