package Chapter20;

import java.util.Arrays;

public class ArraysSort1 {
    public static void main(String[] args) {
        /*
        Person p1 = new Person("A", 21);
        Person p2 = new Person("B", 12);

        if ( p1.compareTo(p2) > 0)
            System.out.println("p1이 p2보다 나이가 많다.");
        else if ( p1.compareTo(p2) < 0)
            System.out.println("p1이 p2보다 어리다");
        else System.out.println("둘은 동갑이다");
         */
        Person[] ar = new Person[3];
        ar[0] = new Person("Lee", 32);
        ar[1] = new Person("Kim", 31);
        ar[2] = new Person("Jun", 28);

        Arrays.sort(ar);
        for(Person ps : ar){
            System.out.println(ps);
        }
    }
}

class Person implements Comparable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.age;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person)o; // compareTo의 인자로 받을 클래스를 (Person)으로 형변환
        /*
        if (this.age < ((Person) o).age) //A compareTo B일때 A가 B보다 작으면 -1반환
            return -1;
        else if (this.age > ((Person) o).age) //A compareTo B일때 A가 B보다 크면 1반환
            return 1;
        else return 0; //A compareTo B일때 A,B가 동일하면 0을 반환
         */
        //간단하게 구현도 가능 - 실무에서는 이렇게 쓰겠지?
        System.out.print(this.age + " ");
        System.out.print(this.name + " ");
        System.out.print(p.age + " ");
        System.out.print(p.name + " ");

        System.out.print(this.age - p.age);
        System.out.println();
        return this.age - p.age;

    }
}
