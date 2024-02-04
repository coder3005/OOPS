/* Private Constructor */                     
class Y
{
    int a; double b; String c;
    private Y()
    {
        a=10; b=30.56; c="abhi";
        System.out.println(a+" "+b+" "+c);
    }
}
class B  /* don't access its a private constructor and will give error */
  {
    public static void main(String[] args) {
        Y r=new Y();
    }
  }
