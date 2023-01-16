package Chapter23;

import java.util.Iterator;
import java.util.LinkedList;

public class classicData {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10); //Integer형 인스턴스가 전달되어야하는데 그냥 기본자료형 숫자가 전달됨.
        list.add(20); // 저장과정에서 오토박싱 진행
        list.add(30);

        int n;
        for (Iterator<Integer> itr = list.iterator(); itr.hasNext();){
            n = itr.next(); // n이 int형이므로 숫자가 전달되어야하는데 인스턴스가 전달되었으므로 오토 언박싱 진행
            System.out.print(n + "\t");
        }
        System.out.println();
    }
}
