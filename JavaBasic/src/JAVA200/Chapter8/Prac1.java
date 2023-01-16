package JAVA200.Chapter8;

class Person{
//    이름 신장 체중 멤벼로가지는 사람클래스
    private String name;
    private double height;
    private double weight;
    
    public Person(String name, double height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
    
    public double getWeight() {
        return weight;
    }
    
    void gainWeight(double weight) {
        this.weight += weight;
    }
    
    void loseWeight(double weight) {
        this.weight -= weight;
    }
    @Override
    public String toString() {
        return this.name + "은 키 : " + this.height +"cm 이고 몸무게는 " +this.weight +"이다.";
    }
}
public class Prac1 {
    public static void main(String[] args) {
        Person p1 = new Person("길동", 189, 80);
        Person p2 = new Person("놀부", 160, 90);
    
        System.out.println(p1);
        System.out.println(p2);
    
        p1.loseWeight(10);
        p2.gainWeight(10);
    
        System.out.println(p1);
        System.out.println(p2);
    
        System.out.println("이름 : "+ p1.getName());
        System.out.println("키 : " + p1.getHeight());
        System.out.println("이름 : "+ p2.getName());
        System.out.println("키 : " + p1.getHeight());
    
    }
    

}


