package Chapter23;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEX {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        //Tree자료구조의 특성상 정렬된 순서로 저장이 됨.
        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");

        //Key만 담고 있는 컬렉션 인스턴스 생성
        Set<Integer> mk = map.keySet();

        //반복자 통해서 가져오기
        for (Iterator<Integer> itr = mk.iterator(); itr.hasNext();){
            System.out.print(map.get(itr.next()) + '\t');
        }
        System.out.println();

        //key 만 뽑기
        for (Integer k : mk){
            System.out.print(k.toString() + '\t');
        }
        System.out.println();

        //value만 뽑기
        for (Integer k : mk){
            System.out.print(map.get(k) + '\t');
        }
        System.out.println();
    }
}
