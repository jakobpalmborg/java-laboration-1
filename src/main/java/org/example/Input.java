package org.example;

import java.util.Scanner;

public class Input {

    public static void input() {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Fyll i priser i öre för varje timme");
        System.out.println("00-01:");
        App.priceArray[0] = scanner.nextInt();
        System.out.println("01-02:");
        App.priceArray[1] = scanner.nextInt();
        System.out.println("02-03:");
        App.priceArray[2] = scanner.nextInt();
        System.out.println("03-04:");
        App.priceArray[3] = scanner.nextInt();
        System.out.println("04-05:");
        App.priceArray[4] = scanner.nextInt();
        System.out.println("05-06:");
        App.priceArray[5] = scanner.nextInt();
        System.out.println("06-07:");
        App.priceArray[6] = scanner.nextInt();
        System.out.println("07-08:");
        App.priceArray[7] = scanner.nextInt();
        System.out.println("08-09:");
        App.priceArray[8] = scanner.nextInt();
        System.out.println("09-10:");
        App.priceArray[9] = scanner.nextInt();
        System.out.println("10-11:");
        App.priceArray[10] = scanner.nextInt();
        System.out.println("11-12:");
        App.priceArray[11] = scanner.nextInt();
        System.out.println("12-13:");
        App.priceArray[12] = scanner.nextInt();
        System.out.println("13-14:");
        App.priceArray[13] = scanner.nextInt();
        System.out.println("14-15:");
        App.priceArray[14] = scanner.nextInt();
        System.out.println("15-16:");
        App.priceArray[15] = scanner.nextInt();
        System.out.println("16-17:");
        App.priceArray[16] = scanner.nextInt();
        System.out.println("17-18:");
        App.priceArray[17] = scanner.nextInt();
        System.out.println("18-18:");
        App.priceArray[18] = scanner.nextInt();
        System.out.println("19-20:");
        App.priceArray[19] = scanner.nextInt();
        System.out.println("20-21:");
        App.priceArray[20] = scanner.nextInt();
        System.out.println("21-22:");
        App.priceArray[21] = scanner.nextInt();
        System.out.println("22-23:");
        App.priceArray[22] = scanner.nextInt();
        System.out.println("23-00:");
        App.priceArray[23] = scanner.nextInt();

        System.out.println("Elpris för varje timme:");
        for(var hour : App.priceArray) {
            System.out.print(hour + ", ");
        }
        System.out.println();
        Menu.menu();
    }
}
