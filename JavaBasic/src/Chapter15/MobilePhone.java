package Chapter15;

public class MobilePhone {
    protected String number;

    public MobilePhone(String number){
        this.number = number;
    }

    public void answer(){
        System.out.println("따르릉~ " + number + "번에서 전화왔어요");
    }
}

class SmartPhone extends MobilePhone{
    private String androidVer;

    public SmartPhone(String number, String androidVer){
        super(number);
        this.androidVer = androidVer;
    }

    public void playApp(){
        System.out.println("앱이 " + androidVer + "버전에서 구동중입니다.");
    }
}

class PhoneTest{
    public static void main(String[] args) {
        SmartPhone phone1 = new SmartPhone("010-555-777", "10");
        phone1.answer();
        phone1.playApp();
    }
}