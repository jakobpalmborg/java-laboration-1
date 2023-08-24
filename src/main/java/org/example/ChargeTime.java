package org.example;

public class ChargeTime {
    public static void chargeTime() {

        System.out.println("Bästa Laddningstid (4h)");
        System.out.println("========");

        if (App.hourPriceArray[0] == null) {
            System.out.println("Inmatning av värden saknas. Gå till menyval 1 för att mata in värden.");
        } else {

            int lowestPriceFor4Hours = 2147483647;
            int indexForBestChargingTime = -1;
            for (int i = 0; i < App.hourPriceArray.length - 3; i++) {
                int sumOf4Hours = App.hourPriceArray[i].price + App.hourPriceArray[i + 1].price + App.hourPriceArray[i + 2].price + App.hourPriceArray[i + 3].price;
                if (sumOf4Hours < lowestPriceFor4Hours) {
                    lowestPriceFor4Hours = sumOf4Hours;
                    indexForBestChargingTime = i;
                }
            }

            String bestTimeToCharge = "";
            for (int i = 0; i < App.hourPriceArray.length - 3; i++) {
                if (indexForBestChargingTime == i) bestTimeToCharge = "kl. " + i + ":00 - " + (i + 4) + ":00";
            }

            System.out.println("De billigaste fyra sammanhängande timmarna är:");
            System.out.println(bestTimeToCharge);
            System.out.println("Medelpriset per timme är: " + lowestPriceFor4Hours / 4 + " öre");
        }
        Menu.menu();
    }
}
