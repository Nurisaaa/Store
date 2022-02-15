package com.company;

import java.util.Random;

public class Store {
    private Products[] products = new Products[20];

    public void doInspection() {
        Random random = new Random();
        System.out.println("=======================  Inspection result  =======================");
        System.out.println("-----------+---------------+---------------+--------------+------------+");
        System.out.println("Product    | Produced On   | Storage place |  life days   | Fish        ");
        for (int i = 0; i < 20; i++) {
            int ran = random.nextInt(5) + 1;
            if (ran == 1) {
                products[i] = new Milk("Milk", 60);
                products[i].isFresh();
                products[i].place();
                System.out.println(products[i].getProductName());
                System.out.println("             "+products[i].getLocalDate());
                System.out.println("                             "+products[i].getPlaceOfProduct());
                System.out.println("                                             "+products[i].getExpDay());
                System.out.println("                                                             "+products[i].getIsFres());
            } else if (ran == 2) {
                products[i] = new Corn("Corn", 150);
                products[i].place();
                products[i].isFresh();
            } else if (ran == 3) {
                products[i] = new Fish("Fish", 20);
                products[i].isFresh();
                products[i].place();
            } else if (ran == 4) {
                products[i] = new Stew("Stew", 180);
                products[i].isFresh();
                products[i].place();
            } else {
                products[i] = new Salt("Salt", (int) Double.POSITIVE_INFINITY);
                products[i].isFresh();
                products[i].place();
            }
        }





    }
}
