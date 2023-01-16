package Chapter23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
        list = new ArrayList<>(list);

        ListIterator<String> litr = list.listIterator(); // 양방향 반복자 획득

        String str;
        while (litr.hasNext()){
            str = litr.next();
            System.out.print(str + '\t');
            if(str.equals("Toy")) //"Toy"만나면 "Toy2" 저장
                litr.add("Toy2");
        }

        System.out.println();

        while (litr.hasPrevious()){
            str =litr.previous();
            System.out.print(str + '\t');
            if(str.equals("Robot"))
                litr.add("Robot2");
        }
    }
}
