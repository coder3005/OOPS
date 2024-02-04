/* Java Methods Program */
class A 
{
    public static void Add()
    {
        int a=10,b=20;
        System.out.print("Sum="+(a+b));
    }
    public static void main(String[] args) {
        
        A r=new A();
        r.Disp();
        A.Add();
    }
    void Disp()
    {
        System.out.print("Learn Coding\n");
    }
}
