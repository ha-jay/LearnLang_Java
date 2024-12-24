package _5_oop_._3_poly_method;

public class Main {
//다형성의 전제조건 : 상속관계, 오버라이딩, upcasting, 동적바인딩
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
    }
}
