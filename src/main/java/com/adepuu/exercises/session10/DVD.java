package com.adepuu.exercises.session10;

public class DVD extends LearningMaterial{
    private String director;

    public DVD(String title, int stock, String director) {
        super(title, stock);
        this.director = director;
    }
}
