package Chapter20;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] ar1 = {1, 9, 12, 4, 3};
        double[] ar2 = {9.1, 19.2, 2.2, 5.3, 14.1};
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        for (int a : ar1)
            System.out.print(a + "\t");// 탭으로 띄워서 출력
        System.out.println();

        for (double b : ar2)
            System.out.print(b + "\t");
        System.out.println();
    }
}
