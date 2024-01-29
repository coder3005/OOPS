package OOPS; 

import java.util.*;

public class OOPS {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c=new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
    }
}
abstract class Animal {
    String color;
    Animal() { //constructor
        color="brown";
    }
    void eat() {
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal {
    void changeColor() {
        color="dark brown"; //sabse pahele upar wala hi call hoga to brown hi pring hoga
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal {
    void changeColor() {
        color="yellow"; //sabse pahele upar wala hi call hoga to brown hi pring hoga
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}
