package org.example;

public class ArmoredCharacter extends GameCharacter{

    public ArmoredCharacter(String name) {
        super(name);
    }

    @Override
    public void takeDamage(int amount) {
        super.takeDamage(amount/2);
    }
}
