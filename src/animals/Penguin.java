package animals;
import behaviors.Walking;

public class Penguin extends Animal implements Walking {

    public Penguin() {
        super("Pinguim");
    }

    @Override
    public String displayCharacteristics() {
        return "O pinguim é uma ave que não voa e adora o frio.";
    }

    @Override
    public String eat() {
        return "Pinguim está comendo.";
    }

    @Override
    public String walk() {
        return "Pinguim está andando desajeitadamente.";
    }
}
