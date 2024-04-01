package com.adepuu.exercises.session10;

public class Magazine extends LearningMaterial {
    private int issueNumber;

    public Magazine(String title, int stock, int issueNumber) {
        super(title, stock);
        this.issueNumber = issueNumber;
    }
}
