package Chapter34;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class ExecutorsDemo {
    public static void main(String[] args) {
        Runnable task = () -> {     // 쓰레드에게 시킬 작업
            int n1 = 10;
            int n2 = 20;
            String name = Thread.currentThread().getName(); //쓰레드풀 이름 가져오기
            System.out.println(name + ": " + (n1 + n2));
        };
        
        ExecutorService exr = Executors.newSingleThreadExecutor(); // 쓰레드저장소와 싱글쓰레드 생성
        exr.submit(task);    // 쓰레드 풀에 작업을 전달

        System.out.println("End " + Thread.currentThread().getName());

        //쓰레드가 할일을 마치고나면 쓰레드풀로 돌아감. 소멸이 아님 소멸시키고 싶다면,
        exr.shutdown();    // 쓰레드 풀과 그 안에 있는 쓰레드의 소멸
    }
}