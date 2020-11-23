package com.example.chef101.pojo;

public class Recipe {
    private String name;
    private String amountOfTime;
    private int imageOfDish;

    public Recipe(String name, String amountOfTime, int imageOfDish) {
        this.name = name;
        this.amountOfTime = amountOfTime;
        this.imageOfDish = imageOfDish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmountOfTime() {
        return amountOfTime;
    }

    public void setAmountOfTime(String amountOfTime) {
        this.amountOfTime = amountOfTime;
    }

    public int getImageOfDish() {
        return imageOfDish;
    }

    public void setImageOfDish(int imageOfDish) {
        this.imageOfDish = imageOfDish;
    }
}
