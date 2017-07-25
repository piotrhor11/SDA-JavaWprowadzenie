package pl.sda.dzien008.Zadanie2;

import java.util.HashSet;

public class Meal {
    private HashSet<Ingredient> meal = new HashSet<>();

    public HashSet<Ingredient> getIngredients() {
        return meal;
    }

    public void addIngredient(Ingredient ingredient) {
        meal.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        meal.remove(ingredient);
    }

    public void printIngredients() {
        for (Ingredient ingredient : meal) {
            System.out.println(ingredient);
        }


    }
}


