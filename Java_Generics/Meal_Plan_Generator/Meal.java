package Java_Generics.Meal_Plan_Generator;

class Meal<T extends MealPlan> {
    private T plan;

    Meal(T plan) {
        this.plan = plan;
    }

    void generate() {
        plan.prepare();
    }

    static <T extends MealPlan> void validateAndGenerate(T plan) {
        System.out.println( plan.prepare());
    }
}