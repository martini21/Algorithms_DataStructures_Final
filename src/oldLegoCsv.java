import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class oldLegoCsv {
    ArrayList items;

    public oldLegoCsv(){
        items = new ArrayList<LegoItem>();
        readFile();
    }

    private void readFile(){
        File file = new File("lego.csv");
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] legoItem = line.split(cvsSplitBy);
                //Clean field
                for(String field: legoItem){

                }
                //Create object
                LegoItem newItem = new LegoItem(legoItem[0], legoItem[1], legoItem[2], legoItem[3], legoItem[4],
                        legoItem[5], legoItem[6], legoItem[7], legoItem[8], legoItem[9], legoItem[10], legoItem[11],
                        legoItem[12], legoItem[13]);
                items.add(newItem);
                System.out.println(legoItem[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
