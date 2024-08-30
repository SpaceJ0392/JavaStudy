import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean flag = set.add("A"); // 자료 추가 - return 타입이 boolean이다. (중복일 경우, false 반환)
        boolean flagB = set.add("B");
        boolean flagA = set.add("A");

        System.out.println(set.size()); // 중복있어 2개만 출력
        System.out.println(flag + " " + flagB + " " + flagA);

        //자료를 하나씩 가져오려면 Collection의 iterator를 사용
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 혹은 foreach문으로 처리도 가능.
        System.out.println("===============================");
        for(String item : set){
            System.out.println(item);
        }
    }
}
