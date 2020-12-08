package com.example.chef101.pojo;

import com.example.chef101.R;

import java.util.ArrayList;

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

    public static ArrayList<Recipe> getRecipesArrayList() {
        ArrayList<Recipe> recipeArrayList = new ArrayList<>();
        recipeArrayList.add(new Recipe("Pizza Margherita", "30 Min", R.drawable.pizza_margherita));
        recipeArrayList.add(new Recipe("Brownies","40 Min", R.drawable.brownies));
        recipeArrayList.add(new Recipe("Fish & Chips", "35 Min",R.drawable.fish_and_chips));
        recipeArrayList.add(new Recipe("Sourdough Bread","4 Hrs", R.drawable.sourdough_bread));
        recipeArrayList.add(new Recipe("Dumplings", "25 Min", R.drawable.dumplings));
        recipeArrayList.add(new Recipe("French Toast", "15 Min", R.drawable.french_toast));
        recipeArrayList.add(new Recipe("Spaghetti & Meatballs", "30 Min", R.drawable.spaghetti));
        return recipeArrayList;
    }
}
