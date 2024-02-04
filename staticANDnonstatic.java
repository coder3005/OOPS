/* Static Vs Non-Static Method */
class A 
{
    int a=10;
    static int b=20;
    public static void main(String[] args) {

        A r=new A();
        r.Disp();
        A.Show();
        
    }
    static void Show()
    {
        System.out.println("Show() "+b);
    }
    void Disp()
    {
       System.out.println("Disp() "+a+" "+b); 
    }
}
