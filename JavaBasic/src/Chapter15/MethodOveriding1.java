package Chapter15;

public class MethodOveriding1 {
    public static void main(String[] args) {
        Cake c0 = new Cake(); // 이때는 당연히 Cake의 yummy가 호출됨
        Cake c1 = new CheeseCake(); //CheeseCake인스턴스가 Cake를 참조
        CheeseCake c2 =new CheeseCake(); // CheeseCake인스턴스가 CheeseCake를 참조.

        c0.yummy();
        c1.yummy();
        c2.yummy();
    }
}

class Cake {
    public void yummy(){
        System.out.println("맛있는 케이크");
    }
    public String toString() { return "My birthday cake";}
}

class CheeseCake extends Cake {
    public void yummy(){
        super.yummy(); //내부에서 호출은 가능
        System.out.println("맛있는 치즈 케이크!");
    }
    public void tasty(){
        super.yummy();
        System.out.println("케이크 먹자~~");
    }
}

