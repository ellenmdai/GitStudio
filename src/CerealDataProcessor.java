import java.util.List;

public class CerealDataProcessor {
    List<Cereal> cerealData;

    public CerealDataProcessor(List<Cereal> cereals) {
        this.cerealData = cereals;
    }

    public float calculateAverage(Constants.CEREAL_PROPERTIES cp) {
        float sum = 0;
        for(Cereal c: this.cerealData) {
            sum += c.getProperty(cp);
        }
        return sum /= this.cerealData.size();
    }

    public double calculateStandardDeviation(Constants.CEREAL_PROPERTIES cp) {
        float sum = 0;
        float average = calculateAverage(cp);

        for (Cereal c: this.cerealData) {
            sum += Math.pow(c.getProperty(cp) - average, 2);
        }

        float standardDeviation = (sum / (this.cerealData.size()-1));
        return Math.sqrt(standardDeviation);
    }

}

