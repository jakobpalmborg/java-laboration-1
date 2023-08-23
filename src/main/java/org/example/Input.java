package org.example;

import java.util.Scanner;

public class Input {
    public static void input() {

        Scanner scanner = new Scanner(System.in);
        int[] priceArray = new int[24];

        System.out.println("Fyll i priser i öre för varje timme");
        System.out.println("00-01:");
        priceArray[0] = scanner.nextInt();
        System.out.println("01-02:");
        priceArray[1] = scanner.nextInt();
        System.out.println("02-03:");
        priceArray[2] = scanner.nextInt();
        System.out.println("03-04:");
        priceArray[3] = scanner.nextInt();
        System.out.println("04-05:");
        priceArray[4] = scanner.nextInt();
        System.out.println("05-06:");
        priceArray[5] = scanner.nextInt();
        System.out.println("06-07:");
        priceArray[6] = scanner.nextInt();
        System.out.println("07-08:");
        priceArray[7] = scanner.nextInt();
        System.out.println("08-09:");
        priceArray[8] = scanner.nextInt();
        System.out.println("09-10:");
        priceArray[9] = scanner.nextInt();
        System.out.println("10-11:");
        priceArray[10] = scanner.nextInt();
        System.out.println("11-12:");
        priceArray[11] = scanner.nextInt();
        System.out.println("12-13:");
        priceArray[12] = scanner.nextInt();
        System.out.println("13-14:");
        priceArray[13] = scanner.nextInt();
        System.out.println("14-15:");
        priceArray[14] = scanner.nextInt();
        System.out.println("15-16:");
        priceArray[15] = scanner.nextInt();
        System.out.println("16-17:");
        priceArray[16] = scanner.nextInt();
        System.out.println("17-18:");
        priceArray[17] = scanner.nextInt();
        System.out.println("18-18:");
        priceArray[18] = scanner.nextInt();
        System.out.println("19-20:");
        priceArray[19] = scanner.nextInt();
        System.out.println("20-21:");
        priceArray[20] = scanner.nextInt();
        System.out.println("21-22:");
        priceArray[21] = scanner.nextInt();
        System.out.println("22-23:");
        priceArray[22] = scanner.nextInt();
        System.out.println("23-00:");
        priceArray[23] = scanner.nextInt();

        System.out.println("Elpris för varje timme:");
        for(var hour : priceArray) {
            System.out.print(hour + ", ");
        }
        System.out.println();
        Menu.menu();
    }
}
