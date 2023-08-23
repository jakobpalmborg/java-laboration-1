package org.example;

import java.util.Arrays;

public class MinMaxAverage {
    public static void minMaxAverage() {
        System.out.println("Elpris för varje timme:");
        for(var hour : App.priceArray) {
            System.out.print(hour + ", ");
        }

        System.out.println();
        int max = Arrays.stream(App.priceArray).max().getAsInt();
        System.out.println("max: " + max);
        
        int min = Arrays.stream(App.priceArray).min().getAsInt();
        System.out.println("min: " + min);

        int average = Arrays.stream(App.priceArray).sum() / 24;
        System.out.println("medel: " + average);

        Menu.menu();
    }
}
