package Chapter34;

import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;

class CallableDemo {
    public static void main(String[] args) 
              throws InterruptedException, ExecutionException {
        Callable<Integer> task = () -> {
            int sum = 0;
            for(int i = 0; i < 10; i++)
                sum += i;
            return sum; //sum이 Integer형이므로 Callable<"Integer">로 반환받고
        };
        
        //쓰레드풀과 싱글쓰레드 생성후
        ExecutorService exr = Executors.newSingleThreadExecutor();
        //위에 Callable<V>값이 Integer였으므로 Future<V>도 Integer로 맞춰줌
        // 쓰레드에게 작업지시(submit)
        Future<Integer> fur = exr.submit(task);
        
        //쓰레드가 일한것 반환받기 .get()
        //task안에 담겨있는 return값을 fur가 갖고있다가 .get()으로 꺼낼 수 있음
        Integer r = fur.get();
        System.out.println("result: " + r);
        exr.shutdown();
    }
}