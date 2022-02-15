package com.company;

import java.time.LocalDate;
import java.util.Random;

public abstract class Products {
    private String productName;
    private int expDay;
    private boolean  isFresh;
    private String placeOfProduct;
    private LocalDate localDate = LocalDate.now().minusDays(random.nextInt(200)+1);

   private static Random random = new Random();

    public Products(String productName, int expDay, boolean isFresh,String place) {
        this.productName = productName;
        this.isFresh = isFresh;
        this.expDay = expDay;
        this.placeOfProduct = place;
//        this.localDate = LocalDate.now().minusDays(random.nextInt(200)+1);
    }

    public Products(String productName, int expDay) {
        this.productName = productName;
        this.expDay = expDay;
    }

    public void  isFresh(){
        if(localDate.minusDays(expDay).isBefore(LocalDate.now())){
            isFresh = false;
        }else {
            isFresh = true;
        }
    }

    void place(){
        if(random.nextInt(2)==1){
            this.placeOfProduct = "Ice-Box";
        }else {
           this.placeOfProduct = "SowCase";
        }
    }

    public String getProductName() {
        return productName;
    }



    public boolean getIsFres(){
        return isFresh;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getExpDay() {
        return expDay;
    }

    public void setExpDay(int expDay) {
        this.expDay = expDay;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    public String getPlaceOfProduct() {
        return placeOfProduct;
    }

    public void setPlaceOfProduct(String placeOfProduct) {
        this.placeOfProduct = placeOfProduct;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
