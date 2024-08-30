public class LambdaExam {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello");
                }
            }
        }).start();

        // 람다식 표현 (위와 동일한 표현이다.)
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
            }
        }).start();
    }
}
