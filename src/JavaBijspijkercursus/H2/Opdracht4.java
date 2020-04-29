package JavaBijspijkercursus.H2;

import java.util.Scanner;

public class Opdracht4 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type een getal tussen 10 en 100: ");
        int userInput = scanner.nextInt();
        int buurman1 = userInput - 2;
        int buurman2 = userInput - 1;
        int buurman3 = userInput + 1;
        int buurman4 = userInput + 2;

        System.out.println("De vijf getallen zijn " + buurman1 + "-" + buurman2 + "-" + userInput + "-" + buurman3 + "-" + buurman4);
    }
}