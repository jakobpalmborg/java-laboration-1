package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMaxAverage {
    public static void minMaxAverage() {

        System.out.println("Elpris för varje timme:");
        for(var hour : App.hourPriceArray) {
            System.out.print("kl: " + hour.hour + " pris: " + hour.price + " öre, ");
        }

        System.out.println();
        
        int max = Arrays.stream(App.priceArray).max().getAsInt();
        System.out.println("max: " + max);
        //int maxIndex = -1;
        ArrayList<Integer> listOfMaxIndex = new ArrayList<>();

        for (int i = 0; i < App.priceArray.length; i++) {
            if (App.priceArray[i] == max) {
                listOfMaxIndex.add(i);
            }
        }

        /*for(var hour : App.priceArray) {
            if(hour == max) {
                maxIndex =
            }
        }*/

        System.out.println("max index: " + listOfMaxIndex);

        int min = Arrays.stream(App.priceArray).min().getAsInt();
        System.out.println("min: " + min);

        int average = Arrays.stream(App.priceArray).sum() / 24;
        System.out.println("medel: " + average);

        Menu.menu();
    }
}
