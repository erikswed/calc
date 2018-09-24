# calc
package com.company;
public class Main {

    private static double[] tal;

    public static void main(String[] args) {

        Kalkylator berakning1 = new Kalkylator();
            berakning1.menyKalk();
    }

}

package com.company;

import java.util.Scanner;

public class Kalkylator {
    static Scanner scan = new Scanner(System.in);
    private double[] tal = new double[2]; //initierar flyttalsvektor
    private int val; //deklarerar variabeln val
    private boolean forts = true; //initierar variabeln forts med true
    private double result;

    //default konstruktor hej hopp
    public Kalkylator() {
        tal[0] = 0;
        tal[1] = 0;
    }

    public Kalkylator(double[] tal) {
        if (tal[0] >= 0 && tal[1] >= 0) {
            this.tal[0] = tal[0];
            this.tal[1] = tal[1];
        } else {
            tal[0] = 0;
            tal[1] = 0;
        }
    }

    /**
     * Denna metoden används for-loopen för
     * inmatning av de 2 talen och sparar talen i en vektor med 2 platser
     * @param tal är de två talen som ska beräknas
     */
    public void mataTvaTal(double[] tal) {
        System.out.println("Mata in två tal: ");
        for (int index = 0; index < 2; index++) {
            tal[index] = scan.nextDouble();

        }
    }
    public void menyKalk() {
        do {
            System.out.printf("%nVad vill du göra? \n1.Addera\n2.Subtrahera\n3.Multiplicera\n4.Dividera\n5.Avsluta");
            val = scan.nextInt();

            switch (val) {
                case 1:
                    mataTvaTal(tal);//anrop metod
                    result = addera(tal);
                    break;
                case 2:
                    mataTvaTal(tal);//anrop metod
                    result = subtrahera(tal);
                    break;
                case 3:
                    mataTvaTal(tal);//anrop metod
                    result = multiplicera(tal);
                    break;
                case 4:
                    mataTvaTal(tal);//anrop metod
                    result = dividera(tal);
                    break;
                case 5:
                    //avsluta
                    forts = false;
                    break;
                default:
                    System.out.println("Inget giltigt val försök igen!");
            }
            if (val == 1 || val == 2 || val == 3 || val == 4) {
                System.out.printf("Resultat: %3.2f", result);
                utokaBerakning();
                komihag(result);
            }
        }
        while (forts == true);
    }

    /**
     * Metoden addera beräknar summan för Kalkylator objekt
     * @param t är de två talen
     * @return summa
     */
    public double addera(double[] t) {
        double sum;
        sum = t[0] + t[1];
        return sum;
    }

    /**
     * Metoden subratera beräknar differensen för Kalkylator objekt
     * @param t är de två talen
     * @return differensen
     */
    public double subtrahera(double[] t) {
        double diff;
        diff = t[0] - t[1];
        return diff;
    }

    /**
     * Metoden multiplicera beräknar produkten för Kalkylator objekt
     * @param t är de två inmatade talen
     * @return produkt
     */
    public double multiplicera(double[] t) {
        double produkt;
        produkt = t[0] * t[1];
        return produkt;
    }
    /**
     * Metoden dividera beräknar kvoten för Kalkylator objekt
     * @param t inmatade talen
     * @return kvot
     */
    public double dividera(double[] t) {
        double kvot = 0;
        if (t[1] != 0) {
            kvot = t[0] / t[1];
        } else {
            System.out.println("Dividerar med  0 ej tillåtet");
        }
        return kvot;
    }
    public void utokaBerakning() {
        boolean fort = true;
        do {
            System.out.println("Vill du utöka beräkningen? \n1 - Ja \n2 - NEJ ");
                    int svar = scan.nextInt();

                    switch (svar) {
                        case 1:
                            komihag(result);
                            break;
                        case 2:
                            fort = false;
                            break;
                            default:
                                System.out.println("felinmatning");
                    }

        }while (fort == true);

    }
    //här har jag problem, det måste uppdateras om man vill utöka beräkningen
    
    public void komihag(double result) {
      result = result + tal[1];
     }

}

