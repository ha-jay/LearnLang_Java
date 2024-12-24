package _6_container._7_streamapi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPITestOperation {
    //스트림 연산 방법
    public static void main(String[] args) {
        // 중간 연산 - filter(Predicate) : 조건에 맞는 요소만 필터링
        // 중간 연산 - map(Function) : 각 요소에 대해서 작업수행
        // 최종연산 - collect(Collector) : 컬렉션결과를 List로 반환
        List<String> namesList = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        List<String> result = namesList.stream()
            .filter(name -> name.length() > 3) // 이름 길이가 3 초과
            .map(String::toUpperCase)          // 대문자로 변환
            .collect(Collectors.toList()); // 컬렉션결과를 List로 반환
        System.out.println(result);


        // 중간연산 - distinct() : 중복요소 제거
        List<String> namesList2 = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Alice", "Bob", "Charlie", "David", "Eve");
        List<String> result2 = namesList2.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println(result2);

        // 중간연산 - sorted() : 요소를 정렬
        List<String> namesList3 = Arrays.asList( "Bob", "Charlie", "David", "Eve", "Alice");
        List<String> result3 = namesList3.stream()
            .sorted()
            .collect(Collectors.toList());
        System.out.println(result3);

        // 중간연산 - limit(long n) : 최대 n개의 요소만 선택
        List<String> namesList4 = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        List<String> result4 = namesList4.stream()
            .limit(3) // 최대 3개의 요소만 선택
            .collect(Collectors.toList());
        System.out.println(result4);

        // 중간연산 - skip(long n) : 최대 n개의 요소를 건너뜀
        List<String> namesList5 = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        List<String> result5 = namesList5.stream()
            .skip(2) // 2개의 요소를 건너뜀
            .collect(Collectors.toList());
        System.out.println(result5);

        // 중간연산 - peek(Consumer) : 각 요소에 대해서 작업수행
        List<String> namesList6 = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        List<String> result6 = namesList6.stream()
            .peek(System.out::println) // 각 요소를 출력
            .collect(Collectors.toList());
        System.out.println(result6);
        

        // 중간연산 - flatMap(Function) : 각 요소를 스트림으로 변환하여 하나의 스트림으로 결합
        // 중간연산 - flatMapToInt(Function) : 각 요소를 IntStream으로 변환하여 하나의 IntStream으로 결합
        // 중간연산 - flatMapToLong(Function) : 각 요소를 LongStream으로 변환하여 하나의 LongStream으로 결합
        // 중간연산 - flatMapToDouble(Function) : 각 요소를 DoubleStream으로 변환하여 하나의 DoubleStream으로 결합
        // 중간연산 - flatMapToObj(Function) : 각 요소를 Stream<R>으로 변환하여 하나의 Stream<R>으로 결합   
     
    }
}
