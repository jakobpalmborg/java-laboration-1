package org.example;

import java.util.Arrays;

public class Sort {


    public static void sort() {

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
            System.out.print("kl: " + hour.hour + " pris: " + hour.price + " öre, ");
            System.out.println();
        }

        Menu.menu();
    }
}
