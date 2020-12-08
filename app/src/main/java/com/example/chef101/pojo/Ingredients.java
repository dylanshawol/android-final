package com.example.chef101.pojo;

import com.example.chef101.R;

import java.util.ArrayList;

public class Ingredients {
    private String ingredient;
    private String amount;

    public Ingredients(String ingredient, String amount) {
        this.ingredient = ingredient;
        this.amount = amount;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

//        "Pizza Margherita"
//        "Brownies"
//        "Fish & Chips"
//        "Sourdough Bread"
//        "Dumplings"
//        "French Toast"
//        "Spaghetti & Meatballs"

    public static ArrayList<Ingredients> getPizzaIngredientsList() {
        ArrayList<Ingredients> ingredientsArrayList = new ArrayList<>();
        ingredientsArrayList.add(new Ingredients("Flour", "2 1/2 cups"));
        ingredientsArrayList.add(new Ingredients("Active Dry Yeast", "1/2 teaspoon"));
        ingredientsArrayList.add(new Ingredients("Salt", "3/4 teaspoon"));
        ingredientsArrayList.add(new Ingredients("Warm Water", "7 ounces"));
        ingredientsArrayList.add(new Ingredients("Extra Virgin Olive Oil", "1 tablespoon"));
        ingredientsArrayList.add(new Ingredients("Semolina", "2 tablespoons"));
        ingredientsArrayList.add(new Ingredients("San Marzano Canned Tomatoes", "1 cup"));
        ingredientsArrayList.add(new Ingredients("Garlic Cloves", "2-3 cloves"));
        ingredientsArrayList.add(new Ingredients("Black Pepper", "2-3 tablespoons"));
        ingredientsArrayList.add(new Ingredients("Parmigiano-Reggiano Cheese", "2-3 tablespoons"));
        ingredientsArrayList.add(new Ingredients("Fresh Mozzarella Cheese", "7 ounces"));
        ingredientsArrayList.add(new Ingredients("Fresh Basil Leaves", "5-6 large leaves"));
        return ingredientsArrayList;
    }

    public static ArrayList<Ingredients> getBrowniesIngredientsList() {
        ArrayList<Ingredients> ingredientsArrayList = new ArrayList<>();
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        return ingredientsArrayList;
    }

    public static ArrayList<Ingredients> getFishAndChipsIngredientsList() {
        ArrayList<Ingredients> ingredientsArrayList = new ArrayList<>();
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        return ingredientsArrayList;
    }

    public static ArrayList<Ingredients> getSourdoughIngredientsList() {
        ArrayList<Ingredients> ingredientsArrayList = new ArrayList<>();
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        return ingredientsArrayList;
    }

    public static ArrayList<Ingredients> getDumplingsIngredientsList() {
        ArrayList<Ingredients> ingredientsArrayList = new ArrayList<>();
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        return ingredientsArrayList;
    }

    public static ArrayList<Ingredients> getFrenchToastIngredientsList() {
        ArrayList<Ingredients> ingredientsArrayList = new ArrayList<>();
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        return ingredientsArrayList;
    }

    public static ArrayList<Ingredients> getSpaghettiIngredientsList() {
        ArrayList<Ingredients> ingredientsArrayList = new ArrayList<>();
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        ingredientsArrayList.add(new Ingredients("", ""));
        return ingredientsArrayList;
    }

    public static ArrayList<ArrayList<Ingredients>> getMainIngredientsList() {
        ArrayList<ArrayList<Ingredients>> mainList = new ArrayList<>();
        mainList.add(getPizzaIngredientsList());
        mainList.add(getBrowniesIngredientsList());
        mainList.add(getFishAndChipsIngredientsList());
        mainList.add(getSourdoughIngredientsList());
        mainList.add(getDumplingsIngredientsList());
        mainList.add(getFrenchToastIngredientsList());
        mainList.add(getSpaghettiIngredientsList());
        return mainList;
    }



}
