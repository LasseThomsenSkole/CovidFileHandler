import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    File data = new File("11_noegletal_pr_region_pr_aldersgruppe.csv");
    public ArrayList<Covid19Data> loadData() {
        ArrayList<Covid19Data> listeAfData = new ArrayList<>();

        try (Scanner scanner = new Scanner(data)) {
            scanner.nextLine(); //Header
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] value = line.split(";");

                if (value.length == 6){
                    String region = value[0];
                    String aldersGruppe = value[1];
                    int bekræftetTilfælde = Integer.parseInt(value[2].trim());
                    int døde = Integer.parseInt(value[3].trim());
                    int intensiv = Integer.parseInt(value[4].trim());
                    int indlagt = Integer.parseInt(value[5].trim());

                    if (validateData(value)){
                        Covid19Data data = new Covid19Data(region,aldersGruppe,bekræftetTilfælde,døde,intensiv,indlagt);
                        listeAfData.add(data);
                    }
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("forkert file");
        }
        return listeAfData;
    }
    public boolean validateData(String[] value){
        switch (value[0]){
            case "Hovedstaden", "Nordjylland", "Midtjylland", "Sjælland", "Syddanmark" -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }
}
