package animals;

import behaviors.Walking;
import behaviors.Swimming;

public class Penguin extends Animal implements Walking, Swimming {
    public Penguin() {
        super("Pinguim");
    }

    @Override
    public void displayCharacteristics() {
        System.out.println("O pinguim tem penas, mas não voa.");
    }

    @Override
    public void walk() {
        System.out.println("O pinguim está andando.");
    }

    @Override
    public void swim() {
        System.out.println("O pinguim está nadando.");
    }
}
