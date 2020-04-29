package JavaBijspijkercursus.H2;

import java.awt.*;
import java.util.Scanner;

public class Opdracht1{


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Typ het aantal mijlen: ");
        double mijlen = scanner.nextDouble();
        double kilometers = mijlen * 1.6;
        int tussenstap = (int) (kilometers * 10);
        kilometers = tussenstap / 10.0;

        System.out.println(mijlen + " mijlen is " + kilometers + " kilometers");
    }
}
