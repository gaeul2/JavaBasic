package Chapter14;

public class Man {
    private String name;

    public Man(String name){
        this.name = name;
    }

    public void tellYourName(){
        System.out.println("제 이름은 " + name);
    }
}

class BusinessMan extends Man {
    String company;
    String position;

    public BusinessMan(String name, String company, String position) {
        /*하위 클래스의 생성자에서는 반드시 상위클래스의 생성자를 호출하게 되어있음
            생성자안에서 super();를 사용하면 상위클래스 생성자 호출
         */
        super(name);
        this.company = company;
        this.position = position;
    }

    public void tellYourInfo() {
        System.out.println("제 회사는 " + company);
        System.out.println("제 직함은 " + position);
        tellYourName();
    }
}

class TestMan {
    public static void main(String[] args) {
        BusinessMan man1 = new BusinessMan("이가을", "코아아이티", "사원");
        man1.tellYourInfo();
    }
}