package no.hvl.dat100;

import java.util.Scanner;

public class O3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn heiltal større enn 0: ");
        int n = scanner.nextInt();

        while (n <= 0) {
            System.out.print("Ugyldig tal. Skriv inn heiltall større enn 0: ");
            n = scanner.nextInt();
        }

        long fakultet = 1;
        int i = 1;
        while (i <= n) {
            fakultet *= i;
            i++;
        }

        System.out.println("Fakultet av " + n + " er: " + fakultet);
    }
}