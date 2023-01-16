package Chapter23;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("Toy");
        list.add("Box");
        list.add("Robot");

//        for(String a : list)
//            System.out.print(a + '\t');
//        System.out.println();
//
//        list.remove(0);

        //순차적 접근방법
        //1. enhanced for
//        for(String a : list)
//            System.out.print(a + '\t');
//        System.out.println();

        //2. 반복자를 이용한 순차적 참조
        Iterator<String> itr = list.iterator();

        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }
    }
}
