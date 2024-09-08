package no.hvl.dat100;

import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double brutto;
        while (true) {
            System.out.println("Skriv inn brutto: ");
            brutto = scanner.nextDouble();

            if (brutto >= 0) {
                break;
            } else {
                System.out.println("Du kan ikkje skrive inn brutto mindre enn 0.");
            }
        }

        double trinnskatt = reknTrinnSkatt(brutto);

        System.out.println("Trinnskatten du må betale er " + trinnskatt);

        scanner.close();
    }

    public static double reknTrinnSkatt(double brutto) {
        double trinnskatt = 0.0;

        if (brutto > 208050 && brutto <= 292850) {
            trinnskatt += (brutto - 208050) * 0.017;
        } else if (brutto > 292850 && brutto <= 670000) {
            trinnskatt += (brutto - 292850) * 0.04;
            trinnskatt += (292850 - 208050) * 0.017;
        } else if (brutto > 670000 && brutto <= 937900) {
            trinnskatt += (brutto - 670000) * 0.136;
            trinnskatt += (670000 - 292850) * 0.04;
            trinnskatt += (292850 - 208050) * 0.017;
        } else if (brutto > 937900 && brutto <= 1350000) {
            trinnskatt += (brutto - 937900) * 0.166;
            trinnskatt += (937900 - 670000) * 0.136;
            trinnskatt += (670000 - 292850) * 0.04;
            trinnskatt += (292850 - 208050) * 0.017;
        } else if (brutto > 1350000) {
            trinnskatt += (brutto - 1350000) * 0.176;
            trinnskatt += (1350000 - 937900) * 0.166;
            trinnskatt += (937900 - 670000) * 0.136;
            trinnskatt += (670000 - 292850) * 0.04;
            trinnskatt += (292850 - 208050) * 0.017;
        }

        return Math.floor(trinnskatt);
    }
}

