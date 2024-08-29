import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        // 다 같은 Collection interface를 사용하므로, 구조가 동일한 부분이 많다.
        List<String> list = new ArrayList<>();
        list.add("A"); //자료 추가
        list.add("B");
        list.add("A");

        System.out.println(list.size()); // 중복 허용

        //List는 순서가 있으므로 index 사용 가능
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
