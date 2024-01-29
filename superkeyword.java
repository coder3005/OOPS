package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Horse h=new Horse();
        System.out.println(h.color);
    }
}
class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor is called");
    }
}
class Horse extends Animal {
    Horse() {
        super(); //by default rahta hai, if we didn't write then also it will give same result
        super.color="brown";
        System.out.println("horse constructor is called");
    }
}
