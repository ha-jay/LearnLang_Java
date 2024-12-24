package _6_container._2_List;

import java.util.List;
import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        //ArrayList 생성
        List<String> list = new ArrayList<>();

        //요소 추가
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);   

        //특정위치에 요소추가
        list.add(1, "D");
        System.out.println(list);

        //특정위치의 요소 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        //특정위치의 요소 수정
        list.set(1, "E");
        System.out.println(list);

        //특정위치의 요소 삭제
        list.remove(1);
        System.out.println(list);

        //인덱스 조회
        list.add("A");
        System.out.println(list);
        System.out.println(list.indexOf("A"));//0
        System.out.println(list.indexOf("B"));
        System.out.println(list.indexOf("C"));
        //lastIndexOf() 메서드로 마지막 요소의 인덱스 조회
        System.out.println(list.lastIndexOf("A"));//2
        System.out.println(list.lastIndexOf("B"));
        System.out.println(list.lastIndexOf("C"));
    }
    
}

