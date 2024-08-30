public class ThreadExam05 extends Thread {
    private int tot;

    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(tot + i);
            tot += i;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        notify(); //wait하고 있는 쓰레드를 깨움
    }

    public static void main(String[] args) {
        ThreadExam05 t = new ThreadExam05();
        t.start(); // run()시, 모니터링 락을 획득

        // 만약 main 쓰레드가 아래의 동기화 블록을 위의 Thread보다 먼저 실행했다면
        // wait를 하게 되면서 모니터링 락을 놓고 대기
        synchronized (t) {
            try {
                t.wait(); // t가 우선 처리 될 수 있도록 대기...
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(t.tot);
        }
    }
}
