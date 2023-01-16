package Chapter23;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>(); // LinkedList<E> 인스턴스를 Queue형 참조변수를 참조해서 생성
        que.offer("Box");
        que.offer("Box");
        que.offer("Toy");
        que.offer("Robot");

        //맨처음 무엇이 나올지 확인
        System.out.println("next : " + que.peek());

        //첫번째 ~ 세번째 인스턴스 꺼내기
        System.out.println(que.poll());
        System.out.println(que.poll());
        System.out.println(que.poll());

        //꺼낸 뒤 무엇이 나올지 확인
        System.out.println("next : " + que.peek());

        //마지막 인스턴스 꺼내기
        System.out.println(que.poll());
        System.out.println(que.poll()); //꺼낼게 없으면 예외가아닌 null 반환
        System.out.println(que.remove()); //꺼낼게 없으면 예외 반환
    }
}
