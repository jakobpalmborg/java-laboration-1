package org.example;

import java.util.Arrays;

public class Sort {


    public static void sort() {

        System.out.println("Sortera");
        System.out.println("========");

        if (App.hourPriceArray[0] == null) {
            System.out.println("Inmatning av värden saknas. Gå till menyval 1 för att mata in värden.");
        } else {

            HourPrice[] sortedArray = new HourPrice[24];
            System.arraycopy(App.hourPriceArray, 0, sortedArray, 0, 24);

            int i, j;
            HourPrice temp;
            boolean swapped;
            for (i = 0; i < sortedArray.length - 1; i++) {
                swapped = false;
                for (j = 0; j < sortedArray.length - i - 1; j++) {
                    if (sortedArray[j].price > sortedArray[j + 1].price) {
                        temp = sortedArray[j];
                        sortedArray[j] = sortedArray[j + 1];
                        sortedArray[j + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped)
                    break;
            }

            for (var hour : sortedArray) {
                System.out.println("kl: " + hour.hour + " pris: " + hour.price + " öre, ");
            }
        }
        Menu.menu();
    }
}
