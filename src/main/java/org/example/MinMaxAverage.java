package org.example;

public class MinMaxAverage {
    public static void minMaxAverage() {

        System.out.println("Min, Max och Medel");
        System.out.println("========");

        if (App.hourPriceArray[0] == null) {
            System.out.println("Inmatning av värden saknas. Gå till menyval 1 för att mata in värden.");
        } else {
            int maxValue = -1;
            int indexOfMaxValue = -1;

            for (int i = 0; i < App.hourPriceArray.length; i++) {
                if (App.hourPriceArray[i].price > maxValue) {
                    indexOfMaxValue = i;
                    maxValue = App.hourPriceArray[i].price;
                }
            }
            System.out.println("max: " + " kl: " + App.hourPriceArray[indexOfMaxValue].hour + " pris: " + App.hourPriceArray[indexOfMaxValue].price + " öre");

            int minValue = 2147483647;
            int indexOfMinValue = -1;
            for (int i = 0; i < App.hourPriceArray.length; i++) {
                if (App.hourPriceArray[i].price < minValue) {
                    indexOfMinValue = i;
                    minValue = App.hourPriceArray[i].price;
                }
            }
            System.out.println("min: " + " kl: " + App.hourPriceArray[indexOfMinValue].hour + " pris: " + App.hourPriceArray[indexOfMinValue].price + " öre");

            int average;
            int total = -1;
            for (var hour : App.hourPriceArray) {
                total += hour.price;
            }
            average = total / 24;
            System.out.println("medel: " + average + " öre");
        }

        Menu.menu();
    }
}
