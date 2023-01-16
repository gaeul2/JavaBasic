package Chapter15;

public class MethodOverinding3 {
    public static void main(String[] args) {
        Cake c1 = new CheeseCake();
        CheeseCake c2 = new CheeseCake();

        c1.yummy();
//        c2.tasty();
//        c2.yummy();
    }
}
