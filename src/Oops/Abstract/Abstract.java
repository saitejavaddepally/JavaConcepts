package Oops.Abstract;


// multiple inheritance interface

abstract class Animal{
//    an abstract method has no body
    abstract void makeSound();
    abstract void eat();

    void name(){
        System.out.println("All animals come under me");
    }
}

class Dog extends Animal{

// an abstract method must be compulsorily override in the subclass
    @Override
    void makeSound(){
        System.out.println("I bark");
    }

    @Override
    void eat() {
        System.out.println("I eat as dog eats");
    }
}

class Cat extends Animal{

    @Override
    void makeSound() {
        System.out.println("I meow");
    }

    @Override
    void eat() {
        System.out.println("I eat as cat");
    }
}


public class Abstract {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.name();
    }

}
