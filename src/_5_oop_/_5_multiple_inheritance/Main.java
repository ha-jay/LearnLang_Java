package _5_oop_._5_multiple_inheritance;

public class Main {
    public static void main(String[] args) {
        // Bird 객체 생성
        Flyable bird = new Bird();
        bird.fly();

        // Fish 객체 생성
        Swimable fish = new Fish();
        fish.swim();

        // Duck 객체 생성
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
