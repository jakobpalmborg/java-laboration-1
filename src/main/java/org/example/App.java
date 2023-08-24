package org.example;

import static org.example.Menu.menu;

public class App {
    //public static int[] priceArray = new int[24];
    public static int[] priceArray = {1,2,3,4,5,6,7,8,9,1,11,2,3,4,5,6,7,11,9,2,1,2,3,4};
    public static HourPrice[] hourPriceArray = new HourPrice[24];
    public static void main(String[] args) {

        menu();
    }
}
