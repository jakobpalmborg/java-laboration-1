package org.example;

import java.util.Arrays;

public class Sort {
    public static HourPrice[] sortedArray = new HourPrice[24];

    public static void sort() {

        int i, j;
        HourPrice temp;
        boolean swapped;
        for (i = 0; i < App.hourPriceArray.length - 1; i++) {
            swapped = false;
            for (j = 0; j < App.hourPriceArray.length - i - 1; j++) {
                if (App.hourPriceArray[j].price > App.hourPriceArray[j + 1].price) {
                    temp = App.hourPriceArray[j];
                    App.hourPriceArray[j] = App.hourPriceArray[j + 1];
                    App.hourPriceArray[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

        for (var hour : App.hourPriceArray) {
            System.out.print("kl: " + hour.hour + " pris: " + hour.price + " öre, ");
            System.out.println();
        }

        Menu.menu();
    }
}
