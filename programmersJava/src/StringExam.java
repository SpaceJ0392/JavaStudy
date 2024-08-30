public class StringExam {

    public static void main(String[] args) {
        String ex1 = "hello world";
        String ex2 = ex1.substring(5); //substring() : 문자열을 잘라서 복사하는 메소드
        System.out.println("ex1 = " + ex1 + " ex2 = " + ex2);

        String ex3 = ex1 + ex2; // 내부적으로 String 덧셈 연산은 StringBuffer를 통해 append 하는 형식으로 내부 구현된다.
        System.out.println("ex3 = " + ex3);

        // String + String의 내부 구현
        String ex4 = new StringBuffer().append(ex1).append(ex2).toString();
        System.out.println("ex4 = " + ex4);

        //반복문을 통한 String 연산
        String ex5 = "";
        for (int i = 0; i < 100; i++) {
            ex5 += "*";
            //문제는 반복문 당 StringBuffer 객체를 만들어, 100개의 객체를 만들어 합친다. (비효율적)
        }
        System.out.println(ex5);

        // 위의 방법의 효율화
        StringBuffer ex6 = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            ex6.append("*");
        }
        System.out.println(ex6);

    }
}
