package Chapter23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
        list = new ArrayList<>(list);
        for (String a : list){
            System.out.print(a + " ");
        }
        System.out.println();

        list = new LinkedList<>(list);
        for (String a : list){
            System.out.print(a + " ");
        }
    }
}
