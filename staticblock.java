/* Static Block */
class A 
{
    public static void main(String[] args) {
        A r=new A();
    }
    A() /*constructor block*/
    {
       System.out.println("please share"); 
    }
    { /*instance block*/
        System.out.println("\n please like");
    }
    static{
        System.out.println("learn coding");
    }
}
