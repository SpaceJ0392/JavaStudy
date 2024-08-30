import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "A"); // 자료 저장
        map.put("002", "B");
        map.put("003", "C");

        map.put("001", "D");
        System.out.println(map.size()); // 키 값 중복은 안됨.
        System.out.println(map.get("001")); // 최근 저장 값이 저장.

        Set<String> keySet = map.keySet(); // 모든 key 값 가져오기
        Iterator<String> iter = keySet.iterator();
        while (iter.hasNext()) {
            String nowKey = iter.next();
            System.out.println(nowKey + " " + map.get(nowKey));
        }
        //혹은
        keySet.forEach(key -> System.out.println(key + " " + map.get(key)));
        //혹은
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        //혹은
        System.out.println(map.entrySet());
    }
}
