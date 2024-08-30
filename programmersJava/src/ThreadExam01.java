public class ThreadExam01 extends Thread {
    private final String str;

    public ThreadExam01(String str) {
        this.str = str;
    }

    public void run() { // 흐름이 하나 더 생길 때, 그 흐름을 진행하는 메서드
        for (int i = 0; i < 10; i++) {
            System.out.println(str);
            try {
                Thread.sleep((int)(Math.random() * 1000)); //랜덤하게 0 ~ 1초 쉰다.
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadExam01 t1 = new ThreadExam01("*");
        ThreadExam01 t2 = new ThreadExam01("-");
        t1.start(); // start() : thread를 준비시키며, 준비가 다 되면 run()을 자동 호출 => start()를 해야 thread가 수행됨.
        t2.start();

        System.out.println("main thread end !!!!"); // main이 종료되도, 다른 thread가 종료되는 것은 아님.
    }
}
