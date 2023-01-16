package Chapter18;

public class ArrayIndexOutofBounds{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
