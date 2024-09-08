package no.hvl.dat100;

import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int poeng;
            while (true) {
                System.out.println("Skriv inn antall poeng elev " + i + " fekk mellom (0-100): ");
                poeng = scanner.nextInt();

                if (poeng >= 0 && poeng <= 100) {
                    break;
                } else {
                    System.out.println("Det går ikkje ann å få denne poengsummen skriv inn eit tall mellom 0-100.");
                }
            }

            String karakter = reknKarakter(poeng);

            System.out.println("Karakteren til elev " + i + " blei: " + karakter);
        }
        scanner.close();
    }

    //Utrekning av Karakter basert på poenga eleven fekk
    public static String reknKarakter(int poeng) {
        if (poeng >= 90 && poeng <= 100) {
            return "A";
        }
        else if (poeng >= 80 && poeng <= 89) {
            return "B";
        }
        else if (poeng >= 60 && poeng <= 79) {
            return "C";
        }
        else if (poeng >= 50 && poeng <= 59) {
            return "D";
        }
        else if (poeng >= 40 && poeng <= 49) {
            return "E";
        }
        else {
            return "F";
        }
    }
}
