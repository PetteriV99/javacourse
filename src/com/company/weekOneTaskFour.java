package com.company;/*
Viikko 1 Viikkotehtävä 4
*/

import java.util.Scanner;
import java.util.Random;

public class weekOneTaskFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int[] lottoNumbersList;
        lottoNumbersList = new int[40];

        int[] correctNumbers;
        correctNumbers = new int[7];

        int[] guessedNumbers;
        guessedNumbers = new int[7];

        for (int i = 0; i < 40; i++) {
            lottoNumbersList[i] = i+1;
        }

        for (int k = 0; k < 7; k++) {
            correctNumbers[k] = 1+ rand.nextInt(39);
        }

        System.out.println("Lottorivi on: ");
        for (int m: correctNumbers) {
            System.out.print(m + ", ");
        }

        System.out.println("\nHaluatko arpoa rivin (k= kyllä, e = ei)?");
        String startProgram = scanner.next();
        boolean programStarted = startProgram.equals("k");

        if (programStarted) {
            for (int n = 0; n < 7; n++) {
                guessedNumbers[n] = 1 + rand.nextInt(39);
            }
            System.out.println("Ohjelma arpoi rivin: ");
            for (int element: guessedNumbers) {
                System.out.print(element + ", ");
            }

            int correctAmount = 0;
            int[] checkedNumbers;
            checkedNumbers = new int[7];

            for (int number: guessedNumbers) {
                for (int n: guessedNumbers) {
                    if (n == number) {
                        correctAmount++;
                    }
                }
            }

            System.out.println("\nOikein oli " + correctAmount + " kpl");

        }
        else {
            System.out.println("Kiitos ja hei hei!");
        }
    }
}