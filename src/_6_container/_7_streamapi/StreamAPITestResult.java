package _6_container._7_streamapi;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPITestResult {
    public static void main(String[] args) {
        // 최종연산 - forEach(Consumer) : 각 요소에 대해서 작업수행
        List<String> namesList = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        namesList.stream()
            .forEach(System.out::println);

        // 최종연산 - collect(Collector) : 스트림의 요소를 컬렉션으로 수집
        List<String> namesList2 = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        List<String> result2 = namesList2.stream()
            .collect(Collectors.toList());
        System.out.println(result2);

        // 최종연산 - reduce(BinaryOperator) : 스트림의 요소를 하나로 줄이기 (누적연산수행)
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int  sum  = numbers.stream()
            .reduce(0, Integer::sum); // 초기값 0에서 시작하여 합산
        System.out.println(sum);

        // 최종연산 - count() : 스트림의 요소 개수 반환
        List<String> namesList3 = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        long count = namesList3.stream()
            .count();
        System.out.println(count);

        // 최종연산 - min(Comparator) : 스트림의 최소값 반환
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> min = numbers2.stream()
            .min(Integer::compareTo);
        System.out.println(min.orElse(0));

        // 최종연산 - max(Comparator) : 스트림의 최대값 반환
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> max = numbers3.stream()
            .max(Integer::compareTo);
        System.out.println(max.orElse(0));

        // 최종연산 - findFirst() : 스트림의 첫번째 요소 반환
        List<String> namesList4 = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        Optional<String> first = namesList4.stream()
            .findFirst();
        System.out.println(first.orElse(""));

        // 최종연산 - findAny() : 스트림의 요소 중 하나를 반환
        List<String> namesList5 = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        Optional<String> any = namesList5.stream()
            .findAny();
        System.out.println(any.orElse(""));
        // 최종연산 - anyMatch(Predicate) : 조건에 맞는 요소가 하나라도 있는지 확인
        List<String> namesList7 = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        boolean result7 = namesList7.stream()
            .anyMatch(name -> name.length() > 3); // 이름 길이가 3 초과
        System.out.println(result7);

        // 최종연산 - allMatch(Predicate) : 모든 요소가 조건에 맞는지 확인
        List<String> namesList8 = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        boolean result8 = namesList8.stream()
            .allMatch(name -> name.length() > 3); // 이름 길이가 3 초과
        System.out.println(result8);

        // 최종연산 - noneMatch(Predicate) : 모든 요소가 조건에 맞지 않는지 확인
        List<String> namesList9 = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        boolean result9 = namesList9.stream()
            .noneMatch(name -> name.length() > 3); // 이름 길이가 3 초과
        System.out.println(result9);
    }
}
