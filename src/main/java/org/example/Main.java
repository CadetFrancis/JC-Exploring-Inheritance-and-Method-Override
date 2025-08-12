package org.example;

public class Main {
    public static void main(String[] args) {
        //1. Basic Inheritance: The extends Keyword
//        Car myCar = new Car();
//        myCar.honk();
//        myCar.display();
//        //Mini Challenge
//        Bicycle myBicycle = new Bicycle();
//        System.out.print("Bicycle says: ");
//        myBicycle.honk();
//        System.out.print("Bicycle says: ");
//        myBicycle.ringBell();

        //2. Abstract Classes: Defining a Template
        Circle myCircle = new Circle();
        System.out.println(myCircle.display());

        Rectangle myRectangle = new Rectangle();
        System.out.println(myRectangle.display());
        //Mini Challenge
        Dog myDog = new Dog();
        System.out.println(myDog.breathe());
        System.out.println(myDog.makeSound());

        //3. Method Overriding: Providing a New Implementation




    }
}