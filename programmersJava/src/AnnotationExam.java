import java.lang.reflect.Method;

public class AnnotationExam {

    @Count100
    public void hello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        AnnotationExam exam = new AnnotationExam();

        // 클래스가 가지는 method 정보
        try {
            Method method = exam.getClass().getDeclaredMethod("hello");
            //getClass() : 해당 객체의 Class 정보 반환 (Object의 메소드)

            //해당 메소드가 특정 어노테이션이 적용되는지 확인
            if (method.isAnnotationPresent(Count100.class)) {
                for (int i = 0; i < 100; i++) {
                    exam.hello();
                }
            }
            else{
                exam.hello();
            }
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
