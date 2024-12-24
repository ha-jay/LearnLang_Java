package _6_container._7_streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPITest {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        System.out.println(namesList);
        // 스트림 생성  
        List<String> result = namesList.stream()
           .filter(name -> name.length() > 3) // 이름 길이가 3 초과
           .map(String::toUpperCase)          // 대문자로 변환
           .collect(Collectors.toList()); // 컬렉션결과를 List로 반환
      
        System.out.println(result);
    }
}
