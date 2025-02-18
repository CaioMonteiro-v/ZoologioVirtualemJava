package animals;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String displayCharacteristics(); 

    public String eat() {
        return name + " está comendo.";
    }
}
