package pl.sda.dzien008.Zadanie2;

public class Main {

    public static void main(String[] args) {
        Ingredient cheese = new Ingredient("cheese");
        Ingredient ham = new Ingredient("ham");
        Ingredient tomato = new Ingredient("tomato");
        Ingredient bread = new Ingredient("bread");

        Meal sandwitch = new Meal();
        sandwitch.addIngredient(cheese);
        sandwitch.addIngredient(ham);
        sandwitch.addIngredient(tomato);

        sandwitch.printIngredients();

        Client piotr = new Client();
        piotr.addAllergy(ham);
        System.out.printf("Czy klient po zjedzeniu posiłku skona na skutek alergii: ");
        System.out.println(piotr.isDead(sandwitch) ? "Tak" : "Nie");
    }
}
