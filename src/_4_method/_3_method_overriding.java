package _4_method;
//부모클래스 interface 와 같은 역할을 함.
abstract class Animal {
    protected abstract void sound();
}
//자식클래스 개별 동작 정의
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
//자식 클래스 개별 동작 정의
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}


//실행
public class _3_method_overriding {
    public static void main(String[] args) {
        //upcasting 생성
        Animal animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
    }
}
