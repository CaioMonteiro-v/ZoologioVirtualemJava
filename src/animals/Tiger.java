package animals;

import behaviors.Walking;

public class Tiger extends Animal implements Walking {
    public Tiger() {
        super("Tigre");
    }

    @Override
    public void displayCharacteristics() {
        System.out.println("O tigre tem listras e é um predador.");
    }

    @Override
    public void walk() {
        System.out.println("O tigre está caminhando.");
    }
}
