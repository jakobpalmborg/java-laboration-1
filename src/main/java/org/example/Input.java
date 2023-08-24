package org.example;

import java.util.Scanner;

public class Input {

    public static void input() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fyll i priser i öre för varje timme");

        for (int i = 0; i < 24; i++) {
            HourPrice hourPrice = new HourPrice();
            hourPrice.hour = i + ":00-" + (i + 1) + ":00";
            System.out.println(hourPrice.hour);
            hourPrice.price = scanner.nextInt();
            App.hourPriceArray[i] = hourPrice;
        }

        /*
        System.out.println("Elpris för varje timme:");
        for(var hour : App.hourPriceArray) {
            System.out.print("kl: " + hour.hour + " pris: " + hour.price + " öre, ");
        }
        System.out.println();
        */

        Menu.menu();
    }
}
