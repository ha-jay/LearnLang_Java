package _6_container._3_set;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class setTest {
    public static void main(String[] args) {
        //HashSet 생성
        Set<String> set = new HashSet<>();

        //요소 추가
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        //요소 삭제
        set.remove("B");
        System.out.println(set);

        //addAll() 메서드로 다른 컬렉션의 요소 추가
        set.addAll(Arrays.asList("D", "E", "F"));
        System.out.println(set);

        //removeAll() 메서드로 다른 컬렉션에 있는 요소를 set에서 삭제
        set.removeAll(Arrays.asList("D", "E", "F"));
        System.out.println(set);

       //retainAll() 메서드로 다른 컬렉션에 있는 요소만 남기고 set에서 제외
       set.retainAll(Arrays.asList("A", "B", "C"));
       System.out.println(set);

       //toArray(T[] a) - set의 요소를 특정타입의 배열로 변환
       String[] array = set.toArray(new String[0]);
       System.out.println(Arrays.toString(array));

       //toArray() - set의 요소를 Object[] 배열로 변환
       Object[] array2 = set.toArray();
       System.out.println(Arrays.toString(array2));
    }
}
