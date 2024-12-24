package _6_container._3_set;
import java.util.HashSet;


public class HashSetTest {
    public static void main(String[] args) {
        //HashSet 생성
        HashSet<String> set = new HashSet<>();

        //요소 추가
        set.add("A");
        set.add("B");
        set.add("A");//중복
        set.add("a");//대소문자 구분
        System.out.println(set);

        //요소 삭제
        set.remove("A");
        System.out.println(set);

        //요소 포함 여부 확인
        System.out.println(set.contains("A"));
        System.out.println(set.contains("B"));
        System.out.println(set.contains("C"));

        //요소 개수 조회
        System.out.println(set.size());

        //isEmpty() 메서드로 요소 존재 여부 확인
        System.out.println(set.isEmpty());

        //clear() 메서드로 모든 요소 삭제
        set.clear();
        System.out.println(set);

    }
}
