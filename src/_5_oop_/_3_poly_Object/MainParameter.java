package _5_oop_._3_poly_Object;

public class MainParameter {
    // 다형성 인수 메서드: Object 타입 매개변수 사용
    static void printObjectDetails(Object obj) {
        if (obj instanceof String) {
            System.out.println("String: " + obj);
        } else if (obj instanceof Integer) {
            System.out.println("Integer: " + obj);
        } else if (obj instanceof Double) {
            System.out.println("Double: " + obj);
        } else {
            System.out.println("Unknown type: " + obj);
        }
    }

    public static void main(String[] args) {
        // 다양한 타입의 객체 전달
        printObjectDetails("Hello, World!");
        printObjectDetails(42);
        printObjectDetails(3.14);
        printObjectDetails(new MainParameter());
    }
}