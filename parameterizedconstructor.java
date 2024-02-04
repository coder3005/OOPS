/* Parameterized Constructor */

class T 
{
    int x,y;
    T(int a, int b)//parameterized
    {
        x=a; y=b;
    }
    T(int a, String b)//parameterized
    {
        System.out.println(a+" "+b);
    }
    void show()
    {
        System.out.print(x+" "+y);
    }
}
class R 
{
    public static void main(String[] args) {
        T r=new T(100,200);
        T ref=new T(10,"abhi");
        r.show();
    }
}
