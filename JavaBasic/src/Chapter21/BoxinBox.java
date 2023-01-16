package Chapter21;

class BBox<T>{
    private T ob;
    public void set(T o){
        ob = o;
    }
    public T get () {
        return ob;
    }
}

public class BoxinBox {
    public static void main(String[] args) {
        BBox<String> sBox = new BBox<>();
        sBox.set("I am so happy");

        BBox<BBox<String>> wBox = new BBox<>();
        wBox.set(sBox);

        BBox<BBox<BBox<String>>> zBox = new BBox<>();
        zBox.set(wBox);

        System.out.println(zBox.get().get().get());
    }
}

class BoxFactory {
    public static <T> BBox<T> makeBox(T o){
        BBox<T> box = new BBox<T>();
        box.set(o);
        return box;
    }
}

//class GenericMethodEx {
//    public static void main(String[] args) {
//        BBox<String> sBox = BoxFactory.<String>makeBox("Sweet");
//        BBox<Double> dBox = BoxFactory.<Double>makeBox(7.59);
//
//        //실제로는 이렇게 더 많이 작성.
////        BBox<String> sBox = BoxFactory.makeBox("Sweet");
////        BBox<Double> dBox = BoxFactory.makeBox(7.59);
//    }
//}
