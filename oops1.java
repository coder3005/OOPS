
public class OOPS {
    public static void main(String args[]) {
        Pen p1=new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Yellow");
        System.out.println(p1.color);
        p1.color="Red";
        System.out.println(p1.color);

        BankAccount myAcc=new BankAccount();
        myAcc.username="AbhiGupta";
        myAcc.password="abjal"; // error in this line
        myAcc.setPassword("abcdefghi");
        System.out.println(myAcc.password); //error in this line because it is private
    }
}
class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password=pwd;
    }
}
class Pen {
    String color;
    int tip;

    String getColor() {
        return this.color;
    }

    void setColor(String newColor) {
        this.color=newColor;
    }
    
    void setTip(int newTip) {
        this.tip=newTip;
    }
}

