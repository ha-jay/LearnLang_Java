package _6_container._5_map;
import java.util.HashMap;
import java.util.Map;
public class HashMapTest {
    public static void main(String[] args) {
        //HashMap 생성
        Map<String, Integer> map = new HashMap<>();

        //put() 메서드로 요소 추가
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        System.out.println(map);

        //get() 메서드로 요소 조회
        System.out.println(map.get("Apple"));

        //remove() 메서드로 요소 삭제
        map.remove("Banana");
        System.out.println(map);

        //containsKey() 메서드로 키 존재 여부 확인
        System.out.println(map.containsKey("Apple"));

        //containsValue() 메서드로 값 존재 여부 확인
        System.out.println(map.containsValue(2));

        //keySet() 메서드로 모든 키 조회
        System.out.println(map.keySet());

        //values() 메서드로 모든 값 조회
        System.out.println(map.values());

        //entrySet() 메서드로 모든 키-값 쌍 조회
        System.out.println(map.entrySet());
    }
}
