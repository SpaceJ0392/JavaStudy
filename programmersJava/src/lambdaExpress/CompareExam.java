package lambdaExpress;

public class CompareExam {
    public static void exec(Compare compare) {
        int k = 10, m = 20;
        String val = compare.compareTo(k, m) >= 0 ? "i가 크다" : "j가 크다";
        System.out.println(val);
    }

    public static void main(String[] args) {
        exec((i, j) -> i - j);
        // 람다식은 기본적으로 함수형 인터페이스에 젹용된다.
        // 위의 예시의 경우, exec의 매개변수은 compare는 함수형 인터페이스이고,
        // 따라서 람다식은 매개변수 인자를 가지고, 메소드를 만들며, 그 메소드가 포함된 익명 객체를 만든다.
        // 그리고, 그 익명객체를 통해 메소드를 실행한다.
    }
}
