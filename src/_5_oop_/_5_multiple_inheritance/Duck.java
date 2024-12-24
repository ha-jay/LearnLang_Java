package _5_oop_._5_multiple_inheritance;

// 구현 클래스: Duck (다중 상속)
public class Duck implements Flyable, Swimable {
    @Override
    public void fly() {
        System.out.println("The duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming.");
    }
}