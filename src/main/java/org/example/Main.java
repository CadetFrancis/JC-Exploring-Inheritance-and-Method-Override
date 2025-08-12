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
//        Circle myCircle = new Circle();
//        System.out.println(myCircle.display());
//
//        Rectangle myRectangle = new Rectangle();
//        System.out.println(myRectangle.display());
//        //Mini Challenge
//        Dog myDog = new Dog();
//        System.out.println(myDog.breathe());
//        System.out.println(myDog.makeSound());

        //3. Method Overriding: Providing a New Implementation
//        Editor myEditor = new Editor();
//        CodeEditor myCodeEditor = new CodeEditor();
//        Editor polyEditor = new CodeEditor(); // Polymorphism
//
//        System.out.println("--- Regular Editor ---");
//        myEditor.openFile();
//
//        System.out.println("\n--- Code Editor ---");
//        myCodeEditor.openFile();
//
//        System.out.println("\n--- Polymorphic Editor ---");
//        polyEditor.openFile();
//        //Mini Challenge
//        GameCharacter normalCharacter = new GameCharacter("Game");
//        GameCharacter armoredCharacter = new ArmoredCharacter("Armored");
//
//        normalCharacter.takeDamage(100);
//        armoredCharacter.takeDamage(100);

        //4.Inheriting Variables & Access Rules
        CheckingAccount myChecking = new CheckingAccount(100.0);
        myChecking.deductMonthlyFee();
    }
}