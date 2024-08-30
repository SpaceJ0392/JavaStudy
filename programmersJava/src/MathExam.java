public class MathExam {

    public static void main(String[] args) {
        int maxVal = Math.max(5, 30);
        System.out.println(maxVal);

        int minVal = Math.min(5, 30);
        System.out.println(minVal);

        System.out.println(Math.abs(-10)); // 절댓값

        System.out.println(Math.random()); // 랜덤 값 (0.0 ~ 1.0) 반환 (return - double)

        System.out.println(Math.sqrt(25)); // 제곱근 반환

        System.out.println("2의 10승 = " + Math.pow(2, 10));
    }
}
