package Chapter23;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Toy");
        list.add("Box");
        list.add("Robot");

        for(String a : list) System.out.print(a + '\t');
        System.out.println();

        list.remove(0);

        for(String a : list)
            System.out.print(a + '\t');
        System.out.println();
    }
}
