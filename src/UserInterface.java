import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserInterface {
    Scanner keyboard = new Scanner(System.in);

    public void start(ArrayList<Covid19Data> data) {
        int choice;
        do {
            System.out.println("Covid data sortering " + "\n" + "1. for sortering med region 2. for aldersgruppe 3. vis liste 9. for afslut");
            choice = keyboard.nextInt();
            System.out.println("Du må kun bruge et tal");
            // choice = keyboard.nextInt();
            switch (choice) {
                case 1 -> {
                    Collections.sort(data, new RegionComparator());
                    System.out.println(data);
                }
                case 2 -> {
                    Collections.sort(data, new AlderComparator());
                    System.out.println(data);
                }
                case 3 -> System.out.println(data);
            }
        }
        while (!(choice == 9));
    }
    }
