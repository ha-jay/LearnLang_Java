package _5_oop_others._2_innerclass;

interface Greeting {
    void greet();
}

public class _1_innerclassTest_annonymous {
        public static void main(String[] args) {
            //익명 내부 클래스 생성
            //주로 인터페이스나 추상클래스 구현하거나 상속시 사용한다. (이벤트 리스너나 콜백함수에서 사용)
        Greeting greeting = new Greeting() {
            public void greet() {
                System.out.println("Hello, World!");
            }
        };
        greeting.greet();
    }
}
