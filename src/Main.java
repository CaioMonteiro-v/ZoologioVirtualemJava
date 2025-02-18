import animals.*;
import behaviors.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal = null;

        while (true) {
            System.out.println("\nBem-vindo ao Zoológico Virtual!");
            System.out.println("1. Escolher Tigre");
            System.out.println("2. Escolher Golfinho");
            System.out.println("3. Escolher Pinguim");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    animal = new Tiger();
                    break;
                case 2:
                    animal = new Dolphin();
                    break;
                case 3:
                    animal = new Penguin();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
            }

            if (animal != null) {
                System.out.println(getAnimalInfo(animal.getClass().getSimpleName()));
                animal.displayCharacteristics();
                animal.eat();

                if (animal instanceof Walking) {
                    ((Walking) animal).walk();
                }
                if (animal instanceof Swimming) {
                    ((Swimming) animal).swim();
                }
            }
        }
    }

    // Método que retorna informações sobre um animal
    public static String getAnimalInfo(String animalName) {
        switch (animalName.toLowerCase()) {
            case "tiger":
                return "O tigre é um felino forte e ágil.";
            case "dolphin":
                return "O golfinho é inteligente e vive na água.";
            case "penguin":
                return "O pinguim é uma ave que não voa e adora o frio.";
            default:
                return "Animal não encontrado.";
        }
    }
}
