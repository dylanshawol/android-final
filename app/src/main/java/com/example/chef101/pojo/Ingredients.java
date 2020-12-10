package com.example.chef101.pojo;

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
//        "Chicken Enchiladas"
//        "Dumplings"
//        "French Toast"
//        "Spaghetti & Meatballs"

    public static ArrayList<Ingredients> getPizzaIngredientsList() {
        ArrayList<Ingredients> ingredientsArrayList = new ArrayList<>();
        ingredientsArrayList.add(new Ingredients("All Purpose Flour", "2 1/2 cups"));
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
        ingredientsArrayList.add(new Ingredients("Butter", "1 Cup"));
        ingredientsArrayList.add(new Ingredients("Sugar", "1 Cup"));
        ingredientsArrayList.add(new Ingredients("Eggs", "2"));
        ingredientsArrayList.add(new Ingredients("Vanilla Extract", "1 Teaspoon"));
        ingredientsArrayList.add(new Ingredients("Unsweetened Cocoa Powder", "1/3 Cup"));
        ingredientsArrayList.add(new Ingredients("All Purpose Flour", "1/2 Cup"));
        ingredientsArrayList.add(new Ingredients("Salt", "1/4 Teaspoon"));
        ingredientsArrayList.add(new Ingredients("Baking Powder", "1/4 Teaspoon"));
        ingredientsArrayList.add(new Ingredients("Honey", "1 Tablespoon"));
        ingredientsArrayList.add(new Ingredients("Powdered Sugar", "1 Cup"));
        return ingredientsArrayList;
    }

    public static ArrayList<Ingredients> getFishAndChipsIngredientsList() {
        ArrayList<Ingredients> ingredientsArrayList = new ArrayList<>();
        ingredientsArrayList.add(new Ingredients("Potatoes, peeled and cut into strips", "4"));
        ingredientsArrayList.add(new Ingredients("All Purpose Flour", "1 Cup"));
        ingredientsArrayList.add(new Ingredients("Baking Powder", "1 Teaspoon"));
        ingredientsArrayList.add(new Ingredients("Salt", "1 Teaspoon"));
        ingredientsArrayList.add(new Ingredients("Black Pepper", "1 Teaspoon"));
        ingredientsArrayList.add(new Ingredients("Milk", "1 Cup"));
        ingredientsArrayList.add(new Ingredients("Eggs", "1"));
        ingredientsArrayList.add(new Ingredients("Vegetable Oil", "1 L"));
        ingredientsArrayList.add(new Ingredients("Cod Fillets", "1 1/2 Pounds"));
        return ingredientsArrayList;
    }

    public static ArrayList<Ingredients> getEnchiladasIngredientsList() {
        ArrayList<Ingredients> ingredientsArrayList = new ArrayList<>();
        ingredientsArrayList.add(new Ingredients("Canola Oil", "4 Tablespoons"));
        ingredientsArrayList.add(new Ingredients("All Purpose Flour", "2 Tablespoons"));
        ingredientsArrayList.add(new Ingredients("Enchilada Sauce", "1 (28-Ounce) Can"));
        ingredientsArrayList.add(new Ingredients("Chicken Broth", "2 Cups"));
        ingredientsArrayList.add(new Ingredients("Salt", "1/2 Teaspoon"));
        ingredientsArrayList.add(new Ingredients("Black Pepper", "1/2 Teaspoon"));
        ingredientsArrayList.add(new Ingredients("Ground Beef", "1 Pound"));
        ingredientsArrayList.add(new Ingredients("Onion, finely chopped ", "1"));
        ingredientsArrayList.add(new Ingredients("Corn Tortillas", "10 to 14"));
        ingredientsArrayList.add(new Ingredients("Green Chilies, diced", "2 (4-Ounce) Cans"));
        ingredientsArrayList.add(new Ingredients("Green Onions, chopped", "1 Cup"));
        ingredientsArrayList.add(new Ingredients("Black Olives, chopped", "1/2 Cup"));
        ingredientsArrayList.add(new Ingredients("Cheddar Cheese, grated", "3 Cups"));
        ingredientsArrayList.add(new Ingredients("Cilantro, chopped", "For Garnish"));
        return ingredientsArrayList;
    }

    public static ArrayList<Ingredients> getDumplingsIngredientsList() {
        ArrayList<Ingredients> ingredientsArrayList = new ArrayList<>();
        ingredientsArrayList.add(new Ingredients("Lean Ground Pork", "1 Pound"));
        ingredientsArrayList.add(new Ingredients("Napa Cabbage Leaves, minced", "4"));
        ingredientsArrayList.add(new Ingredients("Green Onions, minced", "6 Stalks"));
        ingredientsArrayList.add(new Ingredients("Shitake Mushrooms, minced", "7"));
        ingredientsArrayList.add(new Ingredients("Bok Choy, minced", "1/2 Cup"));
        ingredientsArrayList.add(new Ingredients("Bamboo Shoots, minced", "1/2 Cup"));
        ingredientsArrayList.add(new Ingredients("Garlic, minced", "2 Cloves"));
        ingredientsArrayList.add(new Ingredients("Fresh Ginger, minced", "3 Tablespoons"));
        ingredientsArrayList.add(new Ingredients("Soy Sauce", "7 Tablespoons"));
        ingredientsArrayList.add(new Ingredients("Corn Starch", "2 Tablespoons"));
        ingredientsArrayList.add(new Ingredients("Sesame Oil", "1 Tablespoon"));
        ingredientsArrayList.add(new Ingredients("Won Ton Wrappers", "36"));
        ingredientsArrayList.add(new Ingredients("Vegetable Oil", "2 Tablespoons"));
        ingredientsArrayList.add(new Ingredients("Water", "As Needed"));
        ingredientsArrayList.add(new Ingredients("Rice Vinegar", "1 1/2 Tablespoons"));
        ingredientsArrayList.add(new Ingredients("Rice Wine", "1 1/2 Tablespoons"));
        ingredientsArrayList.add(new Ingredients("Chili Oil", "1 Teaspoon"));
        return ingredientsArrayList;
    }

    public static ArrayList<Ingredients> getFrenchToastIngredientsList() {
        ArrayList<Ingredients> ingredientsArrayList = new ArrayList<>();
        ingredientsArrayList.add(new Ingredients("Ground Cinnamon", "1 Teaspoon"));
        ingredientsArrayList.add(new Ingredients("Ground Nutmeg", "1/4 Teaspoon"));
        ingredientsArrayList.add(new Ingredients("Sugar", "2 Tablespoons"));
        ingredientsArrayList.add(new Ingredients("Butter", "4 Tablespoons"));
        ingredientsArrayList.add(new Ingredients("Eggs", "4"));
        ingredientsArrayList.add(new Ingredients("Milk", "1/4 Cup"));
        ingredientsArrayList.add(new Ingredients("Vanilla Extract", "1/2 Teaspoon"));
        ingredientsArrayList.add(new Ingredients("Brioche or White Bread", "8 Slices"));
        ingredientsArrayList.add(new Ingredients("Maple Syrup, warmed", "1/2 Cup"));
        return ingredientsArrayList;
    }

    public static ArrayList<Ingredients> getSpaghettiIngredientsList() {
        ArrayList<Ingredients> ingredientsArrayList = new ArrayList<>();
        ingredientsArrayList.add(new Ingredients("Spaghetti", "1 Pound"));
        ingredientsArrayList.add(new Ingredients("Ground Beef", "1 Pound"));
        ingredientsArrayList.add(new Ingredients("Parsley, finely chopped", "1/4 Cup"));
        ingredientsArrayList.add(new Ingredients("Fresh Parmesan, grated", "1/4 Cup"));
        ingredientsArrayList.add(new Ingredients("Eggs", "1"));
        ingredientsArrayList.add(new Ingredients("Garlic, minced", "2 Cloves"));
        ingredientsArrayList.add(new Ingredients("Salt", "To Taste"));
        ingredientsArrayList.add(new Ingredients("Black Pepper", "To Taste"));
        ingredientsArrayList.add(new Ingredients("Red Pepper Flakes", "1/2 Teaspoons"));
        ingredientsArrayList.add(new Ingredients("Extra-Virgin Olive Oil", "2 Tablespoons"));
        ingredientsArrayList.add(new Ingredients("Onion, finely chopped", "1/2 Cup"));
        ingredientsArrayList.add(new Ingredients("Crushed Tomatoes", "1 (28-Ounce) Can"));
        ingredientsArrayList.add(new Ingredients("Bay Leaves", "1"));
        return ingredientsArrayList;
    }

    public static ArrayList<ArrayList<Ingredients>> getMainIngredientsList() {
        ArrayList<ArrayList<Ingredients>> mainList = new ArrayList<>();
        mainList.add(getPizzaIngredientsList());
        mainList.add(getBrowniesIngredientsList());
        mainList.add(getFishAndChipsIngredientsList());
        mainList.add(getEnchiladasIngredientsList());
        mainList.add(getDumplingsIngredientsList());
        mainList.add(getFrenchToastIngredientsList());
        mainList.add(getSpaghettiIngredientsList());
        return mainList;
    }



}
