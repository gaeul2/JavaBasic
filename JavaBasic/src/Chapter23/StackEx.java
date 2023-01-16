package Chapter23;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackEx {
    public static void main(String[] args) {
        Deque<String> deq = new ArrayDeque<>();

        //앞으로 넣고
        deq.offerFirst("1.Box");
        deq.offerFirst("2.Toy");
        deq.offerFirst("3.Robot");

        //앞에서 꺼내기 -> 나중에들어간게 먼저 나옴
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());//꺼낼게 없으면 null반환
        System.out.println(deq.removeFirst()); //꺼낼게 없으면 예외발생
    }
}
