package Chapter13;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] ar = {2, 3, 4, 5, 6};

        for (int a : ar){
            System.out.print(a + "");
        }
        System.out.println();

        int sum = 0;
        for (int e : ar){
            sum += e;
        }
        System.out.println(sum);
    }
}
