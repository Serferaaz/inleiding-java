package JavaBijspijkercursus.H2;

import java.util.Scanner;

public class Opdracht2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hoeveel jaar oud ben je? ");
        int leeftijdInJaren = scanner.nextInt();
        System.out.print("Hoeveel maanden komen daar nog bij? ");
        int leeftijdInMaanden = scanner.nextInt();
        int leeftijdInMinuten = leeftijdInJaren * 365 * 24 * 60 + leeftijdInMaanden * 30 * 24 * 60;
        System.out.println("Dan ben je nu ongeveer " + leeftijdInMinuten + " minuten oud");

    }
}