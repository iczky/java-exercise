package com.adepuu.exercises.session10;

public class Book extends LearningMaterial {
    private String genre;

    public Book(String title, int stock) {
        super(title, stock);
    }

    @Override
    public void borrowMaterial(int totalBorrow){
        if (checkAvailable()){
            System.out.println("You borrow " + totalBorrow + " book with title " + getTitle());
            setStock(getStock() - totalBorrow);
        } else {
            System.out.println("The item is not available!!!");
        }

    }
}
