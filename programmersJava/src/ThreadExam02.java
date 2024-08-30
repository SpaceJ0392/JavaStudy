public class ThreadExam02 implements Runnable {
    private String str;

    public ThreadExam02(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(str);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadExam02 t1 = new ThreadExam02("*");
        ThreadExam02 t2 = new ThreadExam02("-");

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();

        System.out.println("main end !!!!");
    }
}
