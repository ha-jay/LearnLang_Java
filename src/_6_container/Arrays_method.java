package _6_container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_method {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 4, 5};

        //배열 정렬 - 요소를 오름차순 정렬
        Arrays.sort(numbers);
        //배열 출력 - 배열을 문자열로 변환하여 출력
        System.out.println(Arrays.toString(numbers));

        //배열 복사 - 배열을 복사하고 크기 지정가능
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(copy));

        //배열의 일부 복사 - 배열의 일부를 복사하고 크기 지정가능
        int[] copy2 = Arrays.copyOfRange(numbers, 0, 3); //0번째부터 3번째까지 복사
        System.out.println(Arrays.toString(copy2));

        //배열 비교 - 두 배열이 같은지 비교 (두배열의 요소와 순서가 같은지 비교)
        boolean isEqual = Arrays.equals(numbers, copy);
        System.out.println("두 배열은 같습니까? " + isEqual);

        //배열 탐색 - 배열에서 특정 값을 검색합니다. 정렬된 배열에서만 사용 가능합니다.
        int index = Arrays.binarySearch(numbers, 3); //element 3의 인덱스를 찾습니다.
        System.out.println("3의 인덱스: " + index); //3의 인덱스: 2
      
        //배열 초기화 - 배열의 모든 요소를 특정 값으로 초기화
        Arrays.fill(numbers, 0);
        System.out.println(Arrays.toString(numbers));   







        //배열을 리스트로 변환 - asList()를 사용하면 크기가 고정된다. 값은 변화가능
        String[] arrayStr = {"A", "B", "C"};
        List<String> list = Arrays.asList(arrayStr);
        //리스트에 값 추가
        // list.add("D"); //UnsupportedOperationException 예외 발생
        
        //리스트 크기 변경 가능하게 하려면, ArrayList로 변환
        List<String> list2 = new ArrayList<>(Arrays.asList(arrayStr));
        list2.add("D");
        System.out.println(list2);

        
        //스트림 - 배열을 스트림으로 변환 - 요소를 stream api로 처리
        Arrays.stream(arrayStr).forEach(System.out::println);
        //풀어서 써보자
        Arrays.stream(arrayStr)
            .filter(s -> s.equals("A"))
            .forEach(System.out::println);
    }
}

