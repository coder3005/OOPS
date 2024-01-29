package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Tuna t=new Tuna(); 
        t.gills();
        Shark s=new Shark();
        s.gills();
        s.eat();
        Peacock p=new Peacock();
        p.bins();
        p.breathe();
        Dog d=new Dog();
        d.bark();
        Cat c=new Cat();
        c.sit();
        Human h=new Human();
        h.speak();
        h.eat();
        h.breathe();
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
class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}
class Tuna extends Fish {
    int gills=3;
    void gills() {
        System.out.println(gills);
    }
}
class Shark extends Fish {
    int gills=10;
    void gills() {
        System.out.println(gills);
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}
class Peacock extends Bird {
    void bins() {
        System.out.println("bins");
    }
}
class Mammal extends Animal {
    void walk() {
        System.out.println("walk");
    }
}
class Dog extends Mammal {
    void bark() {
        System.out.println("bark");
    }
}
class Cat extends Mammal {
    void sit() {
        System.out.println("sit");
    }
}
class Human extends Mammal {
    void speak() {
        System.out.println("speak");
    }
}
