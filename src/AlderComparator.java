import java.util.Comparator;

public class AlderComparator implements Comparator<Covid19Data> {
    @Override
    public int compare(Covid19Data data1, Covid19Data data2){
        return Integer.compare(Integer.parseInt(data1.aldersGruppe.substring(0, 1)), Integer.parseInt(data2.aldersGruppe.substring(0,1)));
    }
}
