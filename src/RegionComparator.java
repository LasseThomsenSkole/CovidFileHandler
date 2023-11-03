import java.util.Comparator;

public class RegionComparator implements Comparator<Covid19Data> {
    @Override
    public int compare(Covid19Data data1, Covid19Data data2){
        return data1.region.compareTo(data2.region);
    }

}
