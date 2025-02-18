package animals;

import behaviors.Swimming;

public class Dolphin extends Animal implements Swimming {
    public Dolphin() {
        super("Golfinho");
    }

    @Override
    public void displayCharacteristics() {
        System.out.println("O golfinho é inteligente e vive na água.");
    }

    @Override
    public void swim() {
        System.out.println("O golfinho está nadando.");
    }
}
 