package Chapter34;

class MakeThreadDemo {
    public static void main(String[] args) {
        /*Runnable은 run()을 구현해야함. 해당 몸체가 {}안에 구현되어 있음
         
         */
        Runnable task = () -> {
            int n1 = 10;
            int n2 = 20;
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + (n1 + n2));
        };
    
        /*Thread인스턴스 생성시 Runnable의 run을 구현하고 있는
            task를 전달
         */
        Thread t = new Thread(task); //여기까지가 준비과정. 아직 쓰레드 생성안된것
        t.start();// 쓰레드 생성 및 실행

        System.out.println("End " + Thread.currentThread().getName());
    }
}