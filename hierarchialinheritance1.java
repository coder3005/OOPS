/*Hierarchical Inheritance*/
class A 
{
    void input()
    {
        System.out.println("Enter Your Name: ");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("My Name is Abhi ");
    }

}
class C extends A
{
    void disp()
    {
        System.out.println("My Name is Ankush");
    }
}
class Demo
{
    public static void main(String[] args) {
        B r=new B();
        C r2=new C();

        r.input(); r.show();
        r2.input(); r2.disp();
    }
}
