package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Fish dobby=new Fish(); // similar for all
        dobby.swim();
        dobby.breathe();
        dobby.eat();
    }
}
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}
class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}
class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}
