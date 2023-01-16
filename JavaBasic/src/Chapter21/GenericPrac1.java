package Chapter21;

public class GenericPrac1 {

}

class Box {
    private Object ob;

    public void set(Object o) { ob = o; }
    public Object get() {return ob;}
}

class Apple {
    @Override
    public String toString() { return "I am an Apple."; }
}

class Orange {
    @Override
    public String toString() {
        return "I am an Orange.";
    }
}