package org.example;

public class GameCharacter {
    private int health = 100;
    public String name;

    public GameCharacter(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void takeDamage(int amount){
        health -= amount;
        System.out.println(getName() +" character takes " + amount + " damage. New health " + health);
    }
}
