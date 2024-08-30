public class ThreadExam04 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread : " + i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadExam04 t = new ThreadExam04();
        t.start();
        System.out.println("시작");
        try {
            t.join(); // 해당 스레드가 종료될 때까지 대기
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("종료");
    }
}
