package Chapter21;

class TestBox<T>{
    private T ob;

    public void set(T o){
       ob = o;
    }

    public T get() {
        return ob;
    }
}

public class PrimitivesAndGeneric {
    public static void main(String[] args) {
        /*
        * TestBox<int> box = new TestBox<int>();
        * 타입인자로 기본자료형이 올 수 없으므로 컴파일 오류 발생
         */
        TestBox<Integer> iBox = new TestBox<Integer>();
        iBox.set(125);//Integer라고 했는데 int형값이 왔으니 오토 박싱 진행
        int num = iBox.get(); //int형값주면 num에 담겠다고 했는데 Integer인스턴스가 왔으니 오토 언박싱 진행
        System.out.println(num);
    }
}
