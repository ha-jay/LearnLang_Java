package _5_oop_._3_poly_method;

//자식 클래스 개별 동작 정의
public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}