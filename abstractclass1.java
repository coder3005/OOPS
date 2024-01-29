package OOPS; //including this

import java.util.*;

public class OOPS {
    public static void main(String[] args) {
        Mustang myHorse=new Mustang();
        //Animal -> Horse -> Mustang
    }
}
abstract class Animal {
    String color;
    Animal() { //constructor
        System.out.println("animal constructor called");
    }
    void eat() {
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor called");
    }
    void changeColor() {
        color="dark brown"; //sabse pahele upar wala hi call hoga to brown hi pring hoga
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
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
