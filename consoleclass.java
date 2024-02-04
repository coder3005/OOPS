/* Console Class */
import java.io.*;
class A
{
    public static void main(String[] args) {
        
        String str; char ch[];
        Console obj=System.console();
        System.out.print("Enter Username: ");
        str=obj.readLine();
        System.out.print("Enter Password: ");
        ch=obj.readPassword();
        String a=String.valueOf(ch);

        System.out.println("Username: "+str);
        System.out.println("Password: "+a);
    }
}
