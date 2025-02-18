
import animals.*;
import behaviors.*; // Adicione esta linha
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
                animal.displayCharacteristics();
                animal.eat();

                if (animal instanceof behaviors.Walking) {
                    ((Walking) animal).walk();
                }
                if (animal instanceof behaviors.Swimming) {
                    ((Swimming) animal).swim();
                }
            }
        }
    }
}
