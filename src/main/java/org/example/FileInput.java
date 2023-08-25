package org.example;

import java.io.*;

public class FileInput {
    public static void fileInput() {
        System.out.println("Inläsning Från Fil");
        System.out.println("========");

        String file = "src/main/resources/priser.csv";
        BufferedReader reader = null;
        String line = "";
        int index = 0;

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                HourPrice hourPrice = new HourPrice();
                hourPrice.hour = row[0];
                hourPrice.price = Integer.parseInt(row[1]);
                App.hourPriceArray[index] = hourPrice;
                index++;
            }
            System.out.println("Filen är inläst");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        Menu.menu();
    }
}
