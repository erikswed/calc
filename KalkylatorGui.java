/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KalkylatorGui {
    
    static Scanner scan = new Scanner(System.in);
    private double[] tal = new double[2]; //initierar flyttalsvektor
    private boolean forts = true; //initierar variabeln forts med true

    // Skapa själva räknaren
    Calculator calc = new Calculator();
    private String vad = "";
    private int runNr1;
    private int runNr2;
        
    //default konstruktor
    public KalkylatorGui() {
        tal[0] = 0;
        tal[1] = 0;
    }

    public KalkylatorGui(double[] tal) {
        if (tal[0] >= 0 && tal[1] >= 0) {
            this.tal[0] = tal[0];
            this.tal[1] = tal[1];
        } else {
            tal[0] = 0;
            tal[1] = 0;
        }
    }

    KalkylatorGui(int tal1, int tal2, String vad) {
        this.vad = vad;
        this.runNr1 = tal1;
        this.runNr2 = tal2;
    }
    
    public void menyKalk() {
        if(vad != ""){
            if(vad.equals("plussa")){
                double[] val = new double[2];
                val[0] = runNr1;
                val[1] = runNr2;            
                calc.addDigit(val); 
                calc.makeAddition();
            }
            System.out.printf("Du har startat calculatorn med värden och vill utföra " + vad + "\n");
            System.out.printf("Resultat: %3.2f", calc.getMemory());
        }
        
        int val; //deklarerar variabeln val

        do {
            System.out.printf("%nVad vill du göra? "
                    + "\n1.Addera"
                    + "\n2.Subtrahera"
                    + "\n3.Multiplicera"
                    + "\n4.Dividera"
                    + "\n5.ADDERA med senaste resultat"                    
                    + "\n6.SUBTRA med senaste resultat"  
                    + "\n7.MULTI med senaste resultat"  
                    + "\n8.DIVI med senaste resultat"  
                    + "\n6.Avsluta\n\n");
            val = scan.nextInt();
            double[] d;
            switch (val) {
                case 1:
                    mataTvaTal(tal);//anrop metod
                    calc.addDigit(tal);
                    calc.makeAddition();
                    break;
                case 2:
                    mataTvaTal(tal);//anrop metod
                    calc.addDigit(tal);
                    calc.makeSubstraction();
                    break;
                case 3:
                    mataTvaTal(tal);//anrop metod
                    calc.addDigit(tal);
                    calc.makeMultiplication();
                    break;
                case 4:
                    mataTvaTal(tal);//anrop metod
                    calc.addDigit(tal);
                    calc.makeDivision();
                    break;
                case 5: // addera med minne
                    d = new double[]{calc.getMemory(),mataEttTal()};
                    calc.addDigit(d);
                    calc.makeAddition();
                    break;
                 case 6: // addera med minne
                    d = new double[]{calc.getMemory(),mataEttTal()};
                    calc.addDigit(d);
                    calc.makeSubstraction();
                    break;
                case 7: // addera med minne
                    d = new double[]{calc.getMemory(),mataEttTal()};
                    calc.addDigit(d);
                    calc.makeMultiplication();
                    break;
                case 8: // addera med minne
                     d = new double[]{calc.getMemory(),mataEttTal()};
                    calc.addDigit(d);
                    calc.makeDivision();
                    break;                    
                case 9:
                    //avsluta
                    forts = false;
                    break;
                default:
                    System.out.println("Inget giltigt val försök igen!");
            }
            if (val == 1 || val == 2 || val == 3 || val == 4 || val == 5 || val == 6 || val == 7 || val == 8) {
                System.out.printf("Resultat: %3.2f", calc.getMemory());
            }
        }
        while (forts == true);
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
    
   public double mataEttTal() {
   System.out.println("Mata in ett tal: ");
        return scan.nextDouble();
   }
}