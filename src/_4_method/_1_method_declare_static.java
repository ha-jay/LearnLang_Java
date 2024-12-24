package _4_method;

public class _1_method_declare_static {
    // static 메서드  - 스태틱메서드는 
    public static void printHello() {
        System.out.println("Hello, World!");
    }   
    // static 메서드 호출
    public static void main(String[] args) {
        printHello();
        //or
        _1_method_declare_static.printHello();
    }
}
