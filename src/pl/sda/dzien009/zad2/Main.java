public class Main {
    public static void main(String[] args) {
        Ingredient cheese = new Ingredient("cheese");
        Ingredient ham = new Ingredient("ham");
        Ingredient tomato = new Ingredient("tomato");
        Ingredient bread = new Ingredient("bread");

        Meal sandwich = new Meal();
        sandwich.addIngredient(cheese);
        sandwich.addIngredient(ham);
        sandwich.addIngredient(tomato);
        sandwich.addIngredient(bread);

        sandwich.printIngredients();

        Customer julian = new Customer();
        julian.addAllergy(tomato);

        System.out.println(julian);

        if (julian.isDead(sandwich)) {
            System.out.println("He died [*]");
        } else {
            System.out.println("He's alive!");
        }
    }
}
