package Chapter34;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class SyncArrayList {
    //lst에 동기화 적용한 ArrayList<Integer>()를 생성하여 넣어둠
    public static List<Integer> lst = 
              Collections.synchronizedList(new ArrayList<Integer>());

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 16; i++)
            lst.add(i);
        System.out.println(lst);

//        Runnable task = () -> {
//            //lst에게서 반복자를 생성하여 반복자를 통해 lst의 원소들에 각각 +1해줌
//            ListIterator<Integer> itr = lst.listIterator();
//
//            while(itr.hasNext())
//                itr.set(itr.next() + 1);
//        };

        Runnable task = () -> {
            synchronized(lst) {
                ListIterator<Integer> itr = lst.listIterator();

                while(itr.hasNext())
                    itr.set(itr.next() + 1);
            }
        };


        //3개의 쓰레드를 가진 쓰레드풀을 생성한 뒤 task작업을 3번시킴
        ExecutorService exr = Executors.newFixedThreadPool(3);
        exr.submit(task);
        exr.submit(task);
        exr.submit(task);
     
        exr.shutdown();
        //TimeUnit.SECONDS->앞의 인자가 Seconds다 명시해주는것.
        //쓰레드 작업 기다리는데 최대 100초까지만 기다릴게 라고 얘기하는것
        exr.awaitTermination(100, TimeUnit.SECONDS);
        System.out.println(lst);
    }
}