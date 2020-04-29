package JavaBijspijkercursus.H2;

import java.util.Scanner;

public class Opdracht3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Typ het startbedrag: ");
        double startBedrag = scanner.nextInt();
        System.out.print("Typ het rentepercentage: ");
        double rentePercentage = scanner.nextInt();
        double renteBedrag = rentePercentage / 100 * startBedrag;
        double totaalBedrag = startBedrag + renteBedrag;
        System.out.println("De rent is " + renteBedrag + " en het totaalbedrag is " + totaalBedrag);

    }
}