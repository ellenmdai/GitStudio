import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Driver {
    public static void main(String[] args) {
        Set<Cereal> cerealDataset = retrieveCereal();
        CerealDataProcessor cerealDataProcessor = new CerealDataProcessor(cerealDataset);
    }

    /***
     * Pulls the cereal data from the csv file and loads it into a set of Cereal objects
     * @return a set containing cereal objects
     */
    public static Set<Cereal> retrieveCereal() {
        Set<Cereal> cereals = new HashSet<>();
        String cerealFile = "cereal.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        try {
            br = new BufferedReader(new FileReader(cerealFile));
            while ((line = br.readLine()) != null) {
                String[] cerealLine = line.split(csvSplitBy);
                if (cerealLine[0].equals("name")) {
                    continue;
                }
                Cereal c = new Cereal(cerealLine[Constants.CEREAL_INDEX], Float.parseFloat(cerealLine[Constants.CALORIE_INDEX]),
                                      Float.parseFloat(cerealLine[Constants.PROTEIN_INDEX]), Float.parseFloat(cerealLine[Constants.FAT_INDEX]),
                                      Float.parseFloat(cerealLine[Constants.CARBO_INDEX]), Float.parseFloat(cerealLine[Constants.SUGAR_INDEX]),
                                      Float.parseFloat(cerealLine[Constants.RATING_INDEX]));
                cereals.add(c);
                System.out.println(c);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return cereals;
    }
}
