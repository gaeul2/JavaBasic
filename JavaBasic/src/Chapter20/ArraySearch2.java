package Chapter20;

import java.util.Arrays;

public class ArraySearch2 {
    public static void main(String[] args) {
        Person[] ar = new Person[3];
        ar[0] = new Person("Lee", 32);
        ar[1] = new Person("Kim", 31);
        ar[2] = new Person("Jeon", 28);

        Arrays.sort(ar);
        int idx = Arrays.binarySearch(ar, new Person("Lee", 30));
        if (idx == -100){
            System.out.println("일치하는 자료가 없습니다.");
        } else System.out.println(idx);
    }
}
