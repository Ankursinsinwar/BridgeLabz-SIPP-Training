package Java_Generics.Meal_Plan_Generator;

public class Main {
    public static void main(String[] args) {
        Meal<VegetarianMeal> veg = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> vegan = new Meal<>(new VeganMeal());
        Meal<KetoMeal> keto = new Meal<>(new KetoMeal());

        veg.generate();
        vegan.generate();
        keto.generate();

        Meal.validateAndGenerate(new VegetarianMeal());
        Meal.validateAndGenerate(new VeganMeal());
        Meal.validateAndGenerate(new KetoMeal());
    }
}
