package com.company;/*
Viikko 1 Viikkotehtävä 2
*/

import java.util.Scanner;

public class weekOneTaskTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Anna korkeus:");
        int height = scanner.nextInt();

        System.out.println("Anna leveys:");
        int length = scanner.nextInt();

        System.out.println("Anna piirtomerkki:");
        String marker = scanner.next();

        System.out.println("Täytetty vai ei (k=kyllä, e=ei):");
        String fill = scanner.next();
        boolean isFilled = fill.equals("k");

        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1 || isFilled) {
                for (int j = 0; j < length; j++) {
                    System.out.print(marker);
                }
            }
            else {
                for (int j = 0; j < length; j++) {
                    if (j == 0 || j == length - 1) {
                        System.out.print(marker);
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }

    }

}
