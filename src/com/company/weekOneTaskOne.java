package com.company;/*
Viikko 1 Viikkotehtävä 1
*/

import java.util.Scanner;

public class weekOneTaskOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Anna osake:");
        String stock = scanner.next();

        System.out.println("Anna osinkopros:");
        double dividend = scanner.nextDouble() * 0.01;

        System.out.println("Anna sijoitus:");
        int investment = scanner.nextInt();

        System.out.println("Osakkeen " + stock + " tuotto pääomalle " + investment + " on " + (investment * dividend));

    }
}