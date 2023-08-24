package org.example;

import java.util.Scanner;

public class Menu {
    public static void menu() {

        System.out.println("Elpriser");
        System.out.println("========");
        System.out.println("1. Inmatning");
        System.out.println("2. Min, Max och Medel");
        System.out.println("3. Sortera");
        System.out.println("4. Bästa Laddningstid (4h)");
        System.out.println("e. Avsluta");

        Scanner scanner = new Scanner(System.in);

        String menuChoice = scanner.nextLine();

        if (menuChoice.equals("e")) System.exit(0);
        else if (menuChoice.equals("1")) Input.input();
        else if (menuChoice.equals("2")) MinMaxAverage.minMaxAverage();
        else if (menuChoice.equals("3")) Sort.sort();
        else if (menuChoice.equals("4")) ChargeTime.chargeTime();
        else {
            System.out.println("inte ett giltigt val, försök igen");
            menu();
        }
    }
}