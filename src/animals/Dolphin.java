package animals;

import behaviors.Swimming;

public class Dolphin extends Animal implements Swimming {
    public Dolphin() {
        super("Golfinho");
    }

    @Override
    public String displayCharacteristics() {
        return "O golfinho é um mamífero marinho muito inteligente.";
    }

    @Override
    public String swim() {
        return name + " está nadando rapidamente.";
    }
}
