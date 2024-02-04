/* final keyword */
final class Test 
{
    void mNumber()
    {
        System.out.println("9524884487");
    }
    void atmPIN()
    {
        System.out.println("5648");
    }
}
class Thief extends Test // cannot extend
{
    @Override
    void mNumber()
    {
        System.out.println("9524884487");
    }
    @Override 
    void atmPIN()
    {
        System.out.println("5648");
    }
}
class Final  
{
    public static void main(String[] args) {
        Thief t=new Thief();
        t.mNumber(); t.atmPIN();
    }
}
