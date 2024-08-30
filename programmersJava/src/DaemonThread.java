public class DaemonThread implements Runnable {



    @Override
    public void run() {
        while (true) {
            System.out.println("데몬 스레드가 실행 중입니다.");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new DaemonThread());
        thread.setDaemon(true); //Daemon 설정 - 백그라운드 설정
        thread.start();

        Thread.sleep(1000);
        System.out.println("메인 스레드가 종료됩니다.");
    }
}
