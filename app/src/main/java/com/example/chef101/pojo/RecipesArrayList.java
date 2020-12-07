package com.example.chef101.pojo;

import com.example.chef101.R;

import java.util.ArrayList;

public class RecipesArrayList {
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
