package _5_oop_._3_poly_method;

//자식클래스 개별 동작 정의
public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}