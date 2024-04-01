package com.adepuu.exercises.session10;

public class LearningMaterial {
    private String title;
    private boolean isAvailable = true;
    private int stock;

    public LearningMaterial(String title, int stock){
        this.title = title;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void borrowMaterial(int totalBorrow){
        if (checkAvailable()){
            stock = stock - totalBorrow;
        } else {
            System.out.println("The item is not available!!!");
        }

    }

    public boolean checkAvailable(){
        isAvailable = (stock > 0);
        return false;
    }

    public void returnMaterial(){
        stock++;
    }

}
