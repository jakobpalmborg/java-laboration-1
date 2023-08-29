package org.example;

import java.util.Scanner;

public class Input {

    public static void input() {

        System.out.println("Inmatning");
        System.out.println("========");
        System.out.println("Fyll i priser i öre för varje timme");

        Scanner scanner = new Scanner(System.in);
        try {
            for (int i = 0; i < 24; i++) {
                HourPrice hourPrice = new HourPrice();
                hourPrice.hour = (i < 10 ? "0" + i + ":00-" : i + ":00-") + (i == 23 ? "00:00" : i < 9 ? "0" + (i + 1) + ":00" : (i + 1) + ":00");
                System.out.println(hourPrice.hour);
                hourPrice.price = scanner.nextInt();
                App.hourPriceArray[i] = hourPrice;
            }
        } catch (Exception e) {
            System.out.println("Fel inmatning. Använd siffor 0-9.");
            input();
        }

        Menu.menu();
    }
}
