package pl.sda.dzien008.Zadanie2;

import java.util.HashSet;

public class Client {

    private HashSet<Ingredient> allergies = new HashSet<>();

    public void addAllergy(Ingredient allergen) {
        allergies.add(allergen);
    }

    public boolean isDead(Meal meal) {
        for (Ingredient allergen : allergies) {
            if (meal.getIngredients().contains(allergen)) {
                return true;
            }
        }
        return false;
    }
}
