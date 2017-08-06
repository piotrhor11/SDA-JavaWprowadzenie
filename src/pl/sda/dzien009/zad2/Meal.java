package pl.sda.dzien009.zad2;

import java.util.HashSet;

/**
 * Created by sp0rk on 06/07/17.
 */
public class Meal {
    private HashSet<Ingredient> meal = new HashSet<>();

    public void addIngredient(Ingredient ingredient) {
        meal.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        meal.remove(ingredient);
    }

    public HashSet<Ingredient> getIngredients() {
        return meal;
    }

    public void printIngredients() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String description = "Meal containing: ";
        for (Ingredient ingredient : meal) {
            description += "<" + ingredient + ">, ";
        }
        return description;

    }
}
