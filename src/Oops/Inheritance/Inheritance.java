package Oops.Inheritance;

public class Inheritance {
    public static void main(String[] args) {
       Shape amoeba = new Amoeba();
       amoeba.playSound();
    }
}

// super class methods and instance variables can be grabbed from child class by using super.methodName(), super.instanceVariables