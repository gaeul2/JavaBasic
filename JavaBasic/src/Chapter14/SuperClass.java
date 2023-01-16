package Chapter14;

public class SuperClass {
    public SuperClass(){
        System.out.println("나는 부모클래스");
    }

    public SuperClass(int a){
        System.out.println("나는 부모클래스 " + a + "받았다");
    }

    public SuperClass(int a, int b){
        System.out.println("나는 부모클래스 " + a +"랑 " + b + "받았다");
    }

}

class SubClass extends SuperClass{
    public SubClass(){
        System.out.println("나는 자식클래스");
        System.out.println();
    }

    public SubClass(int a){
        super(a);
        System.out.println("나는 자식클래스");
        System.out.println();
    }

    public SubClass(int a, int b){
        super(a, b);
        System.out.println("나는 자식클래스");
        System.out.println();
    }
}

class TestThisClass{
    public static void main(String[] args) {
        new SubClass();
        new SubClass(2);
        new SubClass(5, 6);
    }
}
