package _2_datatype;

public class _5_generic_method {

    // 제네릭 메서드 정의
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    //제네릭 메서드 예시
    public static void main(String[] args) {
        // Integer 타입 배열
        Integer[] intArray = {1, 2, 3, 4, 5};
        // String 타입 배열
        String[] strArray = {"Hello", "World", "Java"};

        printArray(intArray);
        printArray(strArray);
    }
}
