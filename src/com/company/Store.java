package com.company;

import java.time.LocalDate;
import java.util.Random;

public class Store {
    private Products[] products = new Products[20];

    public void doInspection() {
        Random random = new Random();
        System.out.println("=======================  Inspection result  =======================");
        System.out.println("Product    | Produced On   | Storage place |  life days   | Fish        ");
        System.out.println("-----------+---------------+---------------+--------------+------------+");
        for (int i = 0; i < 20; i++) {
            int ran = random.nextInt(5) + 1;
            if (ran == 1) {
                products[i] = new Milk("Milk", 60);
                products[i].setLocalDate(LocalDate.now().minusDays(random.nextInt(200)+1));
                products[i].isFresh();
                products[i].place();
                System.out.print(products[i].getProductName());
                System.out.print("        "+products[i].getLocalDate());
                System.out.print("          "+products[i].getPlaceOfProduct());
                System.out.print("           "+products[i].getExpDay());
                System.out.print("            "+products[i].getIsFres()+"\n");

            } else if (ran == 2) {
                products[i] = new Corn("Corn", 150);
                products[i].place();
                products[i].isFresh();
                System.out.print(products[i].getProductName());
                System.out.print("        "+products[i].getLocalDate());
                System.out.print("          "+products[i].getPlaceOfProduct());
                System.out.print("           "+products[i].getExpDay());
                System.out.print("            "+products[i].getIsFres()+"\n");

            } else if (ran == 3) {
                products[i] = new Fish("Fish", 20);
                products[i].isFresh();
                products[i].place();
                System.out.print(products[i].getProductName());
                System.out.print("        "+products[i].getLocalDate());
                System.out.print("          "+products[i].getPlaceOfProduct());
                System.out.print("           "+products[i].getExpDay());
                System.out.print("             "+products[i].getIsFres()+"\n");
            } else if (ran == 4) {
                products[i] = new Stew("Stew", 180);
                products[i].isFresh();
                products[i].place();
                System.out.print(products[i].getProductName());
                System.out.print("        "+products[i].getLocalDate());
                System.out.print("          "+products[i].getPlaceOfProduct());
                System.out.print("           "+products[i].getExpDay());
                System.out.print("            "+products[i].getIsFres()+"\n");
            } else {
                products[i] = new Salt("Salt",0);
                products[i].setFresh(true);
                products[i].place();
                System.out.print(products[i].getProductName());
                System.out.print("        "+products[i].getLocalDate());
                System.out.print("          "+products[i].getPlaceOfProduct());
                System.out.print("           "+products[i].getExpDay());
                System.out.print("            "+products[i].getIsFres()+"\n");
            }
        }





    }
}
