public class Cereal {
    String name;
    final float calories, protein, fat, carbo, sugars, rating;
    public Cereal(String name, float calories, float protein, float fat, float carbo, float sugars, float rating) {
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbo = carbo;
        this.sugars = sugars;
        this.rating = rating;
    }

    public String toString() {
        return name;
    }
}
