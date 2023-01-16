package Chapter15;

public class MethodOveriding2 {
    public static void main(String[] args) {
        Cake c1 = new StrawberryCheeseCake();
        CheeseCake c2 = new StrawberryCheeseCake();
        StrawberryCheeseCake c3 = new StrawberryCheeseCake();

        c1.yummy();
        c2.yummy();
        c3.yummy();
    }
}

class StrawberryCheeseCake extends CheeseCake{
    public void yummy(){
        System.out.println("맛있는 딸기치즈 케이크!");
    }
}
