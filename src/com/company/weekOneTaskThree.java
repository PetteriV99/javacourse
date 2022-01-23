package com.company;/*
Viikko 1 Viikkotehtävä 3
*/

import java.util.Scanner;
import java.util.ArrayList;

public class weekOneTaskThree {
    public static void main(String[] args) {

        // Käytetään vähän parempaa kirjastoa taulukoihin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ohjelma laskee kuukausien kokonaistulon, keskimääräisen kuukausikohtaisen tulon\n" +
                "ja suurimman kuukausikohtaisen tulon antamiesi tietojen perusteella.\n");

        System.out.println("Syötä kuukausikohtaiset tulot:");

        float incomeMonth = 0;
        int month = 0;
        ArrayList<Float> incomeList = new ArrayList<Float>(1);

        do {
            month++;
            System.out.println("Anna " + month + ". kuukauden tulo:");
            incomeMonth = scanner.nextFloat();
            incomeList.add(incomeMonth);
        } while(incomeMonth >= 0);

        int incomeSum = 0;
        int incomeAvg = 0;

        for (double i : incomeList){
            incomeSum += i;
        }

        incomeAvg = incomeSum / (incomeList.size() - 1);

        float max = incomeList.get(0);

        for (int k = 1; k < incomeList.size(); k++) {
            if (incomeList.get(k) > max) {
                max = incomeList.get(k);
            }
        }

        System.out.println("Kokonaistulot ovat " + incomeSum);
        System.out.println("Keskiarvoinen kuukausikohtainen tulo on " + incomeAvg);
        System.out.println("Suurin kuukausikohtainen tulo on " + max);
    }
}
