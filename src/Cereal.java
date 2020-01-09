public class Cereal {
    String name;
    final float calories, sugars, protein, rating;
    public Cereal(String name, float calories, float sugars, float protein, float rating) {
        this.name = name;
        this.calories = calories;
        this.sugars = sugars;
        this.protein = protein;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public float getCalories() {
        return calories;
    }

    public float getSugars() {
        return sugars;
    }

    public float getProtein() {
        return protein;
    }
    
    public float getRating() {
        return rating;
    }
    
    public String toString() {
        return name + " " + rating;
    }

    public float getProperty(Constants.CEREAL_PROPERTIES cp) {
        switch (cp) {
            case CALORIES:
                return this.calories;
            case SUGAR:
                return this.sugars;
            case PROTEIN:
                return this.protein;
            case RATING:
                return this.rating;
            default:
                return 0;
        }
    }
}
