package Chapter13;

public class Array3 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6, 7};
        int sum = sumOfAry(ar);
        System.out.println(sum);

        int[] ar2 =makeNewIntAry(10);
        System.out.println(ar2.length);
    }

    //메서드의 매개변수로도 사용됨
    static int sumOfAry(int[] ar) {
        //              --------
        int sum = 0;
        for (int i = 0; i < ar.length; i++){
            sum += ar[i];
        }
        return sum;
    }

    //메서드의 결과값 으로도 사용
    static int[] makeNewIntAry(int len){
        int[] ar = new int[len];
        return ar;
    }
}


