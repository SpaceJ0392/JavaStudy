public class WrapperExam {

    public static void main(String[] args) {
        int a = 5;
        //Integer b = new Integer(5); //JAVA 9부터 지원 중단.
        Integer c = 5; // JAVA 5 부터 컴파일러를 통한 자동 변환 가능해짐 (Auto-Boxing)
        Integer d = a;

        int f = c.intValue();
        int g = c; // Auto-un-boxing 마찬가지로 JAVA 5부터 unboxing 가능.

        System.out.println(g);
    }
}
