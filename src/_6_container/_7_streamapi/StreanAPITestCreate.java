package _6_container._7_streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;
import java.util.stream.IntStream;


public class StreanAPITestCreate {
    //스트림 생성 방법
    public static void main(String[] args) {
        // 1. 컬렉션에서 스트림 생성 - stream()
        List<String> namesList = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        Stream<String> stream = namesList.stream();
    
        // 2. 배열에서 스트림 생성 - stream(array)
        String[] namesArray = {"Alice", "Bob", "Charlie", "David", "Eve"};
        Stream<String> stream2 = Arrays.stream(namesArray);

        // 3. 스트림 생성 - Stream.of(element) - 명시적스트림 생성, 즉 직접 요소를 전달하여 스트림 생성
        Stream<String> stream3 = Stream.of("Alice", "Bob", "Charlie", "David", "Eve");

        // 4. 스트림 생성 - Stream.empty() - 비어있는 스트림 생성
        Stream<String> stream4 = Stream.empty();

        // 5. 스트림 생성 - Stream.builder() - 빌더 패턴을 사용하여 스트림 생성
        Stream<String> stream5 = Stream.<String>builder().add("Alice").add("Bob").add("Charlie").build();

        // 6. 스트림 생성 - IntStream.range(start, end) - 범위 내의 정수 스트림 생성
        IntStream stream6 = IntStream.range(1, 10);


    }
}
