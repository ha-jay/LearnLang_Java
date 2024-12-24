package _7_built_in.optional;

import java.util.Optional;

public class OptionalExample1 {
    //Null-safe 메서드 반환
    public Optional<String> findNameById(int id) {
        if (id == 1) {
            return Optional.of("Alice");
        }
        return Optional.empty();
    }
    public static void main(String[] args) {
        Optional<String> name = new OptionalExample1().findNameById(1);
        name.ifPresent(System.out::println); // Alice
    }
}
