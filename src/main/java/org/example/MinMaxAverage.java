package org.example;

public class MinMaxAverage {
    public static void minMaxAverage() {

        System.out.println("Min, Max och Medel");
        System.out.println("========");

        if (App.hourPriceArray[0] == null) {
            System.out.println("Inmatning av värden saknas. Gå till menyval 1 för att mata in värden.");
        } else {
            // Min price
            int minValue = 2147483647;
            int indexOfMinValue = -1;
            for (int i = 0; i < App.hourPriceArray.length; i++) {
                if (App.hourPriceArray[i].price < minValue) {
                    indexOfMinValue = i;
                    minValue = App.hourPriceArray[i].price;
                }
            }

            System.out.println("Minpris: " + App.hourPriceArray[indexOfMinValue].price + " öre");
            System.out.print("Minpris kl: ");
            for (int i = 0; i < App.hourPriceArray.length; i++) {
                if (App.hourPriceArray[i].price == minValue) {
                    System.out.print(App.hourPriceArray[i].hour + ", ");
                }
            }
            System.out.println();

            // Max price
            int maxValue = -1;
            int indexOfMaxValue = -1;

            for (int i = 0; i < App.hourPriceArray.length; i++) {
                if (App.hourPriceArray[i].price > maxValue) {
                    indexOfMaxValue = i;
                    maxValue = App.hourPriceArray[i].price;
                }
            }
            System.out.println("Maxpris: " + App.hourPriceArray[indexOfMaxValue].price + " öre");
            System.out.print("Maxpris kl: ");
            for (int i = 0; i < App.hourPriceArray.length; i++) {
                if (App.hourPriceArray[i].price == maxValue) {
                    System.out.print(App.hourPriceArray[i].hour + ", ");
                }
            }
            System.out.println();

            // Average price
            int average;
            int total = -1;
            for (var hour : App.hourPriceArray) {
                total += hour.price;
            }
            average = total / 24;
            System.out.println("Medelpris: " + average + " öre / timme");
        }

        Menu.menu();
    }
}
