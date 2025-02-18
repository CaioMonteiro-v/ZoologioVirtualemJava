package animals;
import behaviors.Walking;

public class Tiger extends Animal implements Walking {

    public Tiger() {
        super("Tigre");
    }

    @Override
    public String displayCharacteristics() {
        return "O tigre é um felino forte e rápido.";
    }

    @Override
    public String eat() {
        return "Tigre está comendo.";
    }

    @Override
    public String walk() {
        return "Tigre está andando pela selva.";
    }
}
