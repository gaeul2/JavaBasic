package Chapter13;

class Box {
    private String conts;

    Box(String cont) { this.conts = cont; }

    //toString()이 없다면 Array에 담고 꺼내봤을시 그냥 주소만 나옴.
    public String toString() {
        //뭘 돌려주고 뭘 보여줄지 얘가 결정
        return conts;
    }
}

public class ArrayIsInstance2 {
    public static void main(String[] args) {
        Box[] ar = new Box[5];
        System.out.println("length : " + ar.length);
        Box box1 = new Box("나다");
        ar[0] = box1;
        System.out.println(ar[0]);


        int[] ar2 = new int[3];
        ar2[0] = 7;
        ar2[1] = 8;
        ar2[2] = 9;

        int num = ar2[0] + ar2[1] + ar2[2];

        System.out.println(num);

    }
}
