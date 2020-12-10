package com.example.chef101.pojo;

import java.util.ArrayList;

public class Instructions {
    private String instruction;

    public Instructions(String instruction) {
        this.instruction = instruction;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public static ArrayList<Instructions> getPizzaInstructionsList() {
        ArrayList<Instructions> instructionsList = new ArrayList<>();
        instructionsList.add(new Instructions("Prepare Pizza Dough:\nIn a medium bowl, whisk together the all-purpose flour, sugar, yeast and salt. Add the warm water and olive oil, and stir the mixture with a wooden spoon until the dough just begins to come together. It will seem shaggy and dry, but don’t worry."));
        instructionsList.add(new Instructions("Scrape the dough onto a well-floured counter top and knead the dough for three minutes. It should quickly come together and begin to get sticky. Dust the dough with flour as needed (sometimes I will have to do this 2 to 3 times, depending on humidity levels) – it should be slightly tacky, but should not be sticking to your counter top.  After three minutes, the dough should be smooth, slightly elastic, and tacky. Lightly grease a large mixing bowl with olive oil, and place the dough into the bowl."));
        instructionsList.add(new Instructions("Cover the bowl with a kitchen towel (or plastic wrap) and allow the dough to rise in a warm, dry area of your kitchen for 2 hours or until the dough has doubled in size. If your kitchen is very cold, one great tip that I do all the time is to heat a large heatproof measuring cup of water in the microwave for 2-3 minutes. This creates a nice warm environment and I’ll immediately remove the cup and place the bowl with the dough in the microwave until it has risen. "));
        instructionsList.add(new Instructions("Preheat Oven and Pizza Stone:\nPlace the pizza stone on the center (or top third) rack of your oven, and preheat the oven and pizza stone to 550 degrees Fahrenheit (for at least 30-45 minutes). If your oven does not go up to 550 degrees, heat it to the absolute maximum temperature that it can go."));
        instructionsList.add(new Instructions("As the oven is preheating, assemble the ingredients. In a small bowl, stir together the pureed tomatoes, minced garlic, extra virgin olive oil, pepper, and salt. Set aside another small bowl with the cubed mozzarella cheese (pat the cheese with a paper towel to remove any excess moisture)."));
        instructionsList.add(new Instructions("Separate the dough into two equal-sized portions. It will deflate slightly, but that is OK. Place the dough on a large plate or floured counter top, cover gently with plastic wrap, and allow the dough to rest for 5 to 10 minutes."));
        instructionsList.add(new Instructions("Assemble the Pizza:\nSprinkle the pizza peel (alternatively, you can use the back of a baking sheet – but it will be harder!) with a tablespoon of semolina. Gently stretch one ball of pizza dough into roughly a 10-inch circle (don’t worry if its not perfectly uniform). If the dough springs back or is too elastic, allow it to rest for an additional five minutes. The edges of the dough can be slightly thicker, but make sure the center of the dough is thin (you should be able to see some light through it if you held it up). Gently transfer the dough onto the semolina-dusted pizza peel or baking sheet."));
        instructionsList.add(new Instructions("Drizzle or brush the dough lightly with olive oil (teaspoon or so). Using a large spoon, add roughly 1/2 cup of the tomato sauce onto the pizza dough, leaving a 1/2-inch or 3/4-inch border on all sides. Use the back of the spoon to spread it evenly and thinly. Sprinkle a tablespoon of parmigiano-reggiano cheese onto the pizza sauce. Add half of the cubed mozzarella, distributing it evenly over the entire pizza. Using your hands, tear a few large basil leaves, and sprinkle the basil over the pizza. "));
        instructionsList.add(new Instructions("Gently slide the pizza from the peel onto the heated baking stone. Bake for 7 to 8 minutes, or until the crust is golden and the cheese is bubbling and caramelized and the edges of the pizza are golden brown. Remove the pizza carefully from the oven with the pizza peel, transfer to a wooden cutting board or foil, drizzle the top with olive oil, some grated parmigiano-reggiano cheese, and chiffonade of fresh basil. Slice and serve immediately."));
        return instructionsList;
    }

    public static ArrayList<Instructions> getBrowniesInstructionsList() {
        ArrayList<Instructions> instructionsList = new ArrayList<>();
        instructionsList.add(new Instructions("Preheat Oven:\nPreheat oven to 350 degrees F (175 degrees C). Grease and flour an 8-inch square pan."));
        instructionsList.add(new Instructions("Prepare Batter:\nIn a large saucepan, melt 1/2 cup butter. Remove from heat, and stir in sugar, eggs, and 1 teaspoon vanilla. Beat in 1/3 cup cocoa, 1/2 cup flour, salt, and baking powder. Spread batter into prepared pan."));
        instructionsList.add(new Instructions("Bake in preheated oven for 25 to 30 minutes. Do not overcook."));
        instructionsList.add(new Instructions("Prepare Frosting:\nCombine 3 tablespoons softened butter, 3 tablespoons cocoa, honey, 1 teaspoon vanilla extract, and 1 cup confectioners' sugar. Stir until smooth. Frost brownies while they are still warm. Let rest for 5 minutes and serve."));
        return instructionsList;
    }

    public static ArrayList<Instructions> getFishAndChipsInstructionsList() {
        ArrayList<Instructions> instructionsList = new ArrayList<>();
        instructionsList.add(new Instructions("Prepare Chips:\nPlace potatoes in a medium-size bowl of cold water. In a separate medium-size mixing bowl, mix together flour, baking powder, salt, and pepper. Stir in the milk and egg; stir until the mixture is smooth. Let mixture stand for 20 minutes."));
        instructionsList.add(new Instructions("Preheat the oil in a large pot or electric skillet to 350 degrees F (175 degrees C)."));
        instructionsList.add(new Instructions("Fry the potatoes in the hot oil until they are tender. Drain them on paper towels."));
        instructionsList.add(new Instructions("Prepare Fish:\nDredge the fish in the batter, one piece at a time, and place them in the hot oil. Fry until the fish is golden brown. If necessary, increase the heat to maintain the 350 degrees F (175 degrees C) temperature. Drain well on paper towels."));
        instructionsList.add(new Instructions("Fry the potatoes again for 1 to 2 minutes for added crispness. Serve with a wedge of lemon."));
        return instructionsList;
    }

    public static ArrayList<Instructions> getEnchiladasInstructionsList() {
        ArrayList<Instructions> instructionsList = new ArrayList<>();
        instructionsList.add(new Instructions("Prepare Sauce:\nIn a saucepan over medium-low heat, combine the canola oil and flour. Whisk together and allow to bubble for 1 minute. Pour in the red sauce, chicken broth, salt and pepper. Bring to a boil. Reduce the heat and simmer while you prepare the other ingredients."));
        instructionsList.add(new Instructions("Prepare Meat:\nWhile the sauce is simmering, brown the ground beef with the onions in a large skillet over medium-high heat. Drain the fat, add the salt and stir to combine. Turn off the heat and set aside."));
        instructionsList.add(new Instructions("In a small skillet over medium heat, heat some canola oil. Lightly fry the tortillas just until soft. Do not crisp. Drain on a paper towel-lined plate. Repeat until all the tortillas have been fried."));
        instructionsList.add(new Instructions("Preheat the oven to 350 degrees F (175 C)."));
        instructionsList.add(new Instructions("Spread 1/2 cup of the sauce in the bottom of a 9- by 13-inch baking dish. Next, one at a time, dip each tortilla into the sauce. Set the sauce-soaked tortilla on a plate. Place on some of the meat mixture, chilies, green onions and black olives. Top with a generous portion of grated Cheddar. Roll up the tortilla to contain the filling inside."));
        instructionsList.add(new Instructions("Place the tortilla seam side down in the baking dish. Repeat with the rest of the tortillas and pour the remaining sauce over the top. End with a generous sprinkling of cheese and any other bits of chiles, green onions or olives you have left over from the filling."));
        instructionsList.add(new Instructions("Bake the enchiladas for 20 minutes, or until bubbly. Sprinkle chopped cilantro over the top and serve."));
        return instructionsList;
    }

    public static ArrayList<Instructions> getDumplingsInstructionsList() {
        ArrayList<Instructions> instructionsList = new ArrayList<>();
        instructionsList.add(new Instructions("Pork Filling:\nIn a large bowl, combine all pork filling ingredients until well combined."));
        instructionsList.add(new Instructions("Form Dumplings:\nYou will need a clean workspace, wonton wrappers, prepared pork filling, a small bowl of water, and chopsticks."));
        instructionsList.add(new Instructions("Begin by filling the wonton wrapper with about a tablespoons worth of pork filling. Wet your finger, and run along the edges of the wonton wrapper. This will help to seal it closed."));
        instructionsList.add(new Instructions("If your wrapper is round, fold the wrapper over the filling to create a half-moon shape, pinching the edges to seal. If you wrapper is square, scroll up to view the step by step images of how I fold my dumplings into a little purse dumpling."));
        instructionsList.add(new Instructions("Once you have filled the dumplings you can freeze them or eat them fresh."));
        instructionsList.add(new Instructions("Freeze Dumplings:\nPlace the dumplings in a single layer on a cookie sheet and freeze for about 30 minutes."));
        instructionsList.add(new Instructions("Then place in a ziplock baggie, where they can be frozen for up to 3 months."));
        instructionsList.add(new Instructions("Pan Fry:\nHeat a large skillet over medium high heat. Add 2 tablespoons of vegetable oil to the skillet and place dumplings in an even layer. Fry for a few minutes until bottoms are golden."));
        instructionsList.add(new Instructions("Add 1/3 cup of water and cover with a tight fitting lid. Cook until the water has boiled away and then uncover and reduce heat to medium or medium low."));
        instructionsList.add(new Instructions("Let the dumplings cook for another 2 minutes then remove from heat and serve with soy sauce and thinly sliced green onions."));
        instructionsList.add(new Instructions("Steam:\nPlace dumplings in a steamer basket on a single layer of cabbage leaves or a piece of parchment paper and steam for about 8 minutes."));
        instructionsList.add(new Instructions("Dipping Sauce:\nWhisk together all ingredients and serve in a shallow bowl to dip your dumplings in! You can make this ahead and store it in the fridge for up to a week."));
        return instructionsList;
    }

    public static ArrayList<Instructions> getFrenchToastInstructionsList() {
        ArrayList<Instructions> instructionsList = new ArrayList<>();
        instructionsList.add(new Instructions("In a small bowl, combine cinnamon, nutmeg, and sugar and set aside briefly."));
        instructionsList.add(new Instructions("In a 10-inch or 12-inch skillet, melt butter over medium heat. Whisk together cinnamon mixture, eggs, milk, and vanilla and pour into a shallow container such as a pie plate. Dip bread in egg mixture. Fry slices until golden brown, then flip to cook the other side. Serve with syrup."));
        return instructionsList;
    }

    public static ArrayList<Instructions> getSpaghettiInstructionsList() {
        ArrayList<Instructions> instructionsList = new ArrayList<>();
        instructionsList.add(new Instructions("Prepare Spaghetti:\nIn a large pot of boiling salted water, cook spaghetti according to package instructions. Drain."));
        instructionsList.add(new Instructions("Prepare Meatballs & Sauce:\nIn a large bowl, combine beef with bread crumbs, parsley, Parmesan, egg, garlic, 1 teaspoon salt, and red pepper flakes. Mix until just combined then form into 16 balls."));
        instructionsList.add(new Instructions("In a large pot over medium heat, heat oil. Add meatballs and cook, turning occasionally, until browned on all sides, about 10 minutes. Transfer meatballs to a plate."));
        instructionsList.add(new Instructions("Add onion to pot and cook until soft, 5 minutes. Add crushed tomatoes and bay leaf. Season with salt and pepper and bring to a simmer. Return meatballs to pot and cover. Simmer until sauce has thickened, 8 to 10 minutes."));
        instructionsList.add(new Instructions("Serve pasta with a healthy scoop of meatballs and sauce. Top with Parmesan before serving."));
        return instructionsList;
    }

    public static ArrayList<ArrayList<Instructions>> getMainInstructionsList() {
        ArrayList<ArrayList<Instructions>> mainList = new ArrayList<>();
        mainList.add(getPizzaInstructionsList());
        mainList.add(getBrowniesInstructionsList());
        mainList.add(getFishAndChipsInstructionsList());
        mainList.add(getEnchiladasInstructionsList());
        mainList.add(getDumplingsInstructionsList());
        mainList.add(getFrenchToastInstructionsList());
        mainList.add(getSpaghettiInstructionsList());
        return mainList;
    }
}
