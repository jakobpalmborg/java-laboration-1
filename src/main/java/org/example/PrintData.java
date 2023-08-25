package org.example;

public class PrintData {
    public static void printData() {
        System.out.println("Skriv Ut Inmatad Data");
        System.out.println("========");
        if (App.hourPriceArray[0] == null) {
            System.out.println("Inmatning av värden saknas. Gå till menyval 1 eller 5 för att mata in värden.");
        } else {
            for (var hour : App.hourPriceArray) {
                System.out.println("kl: " + hour.hour + " pris: " + hour.price + " öre, ");
            }
        }
        Menu.menu();
    }
}
