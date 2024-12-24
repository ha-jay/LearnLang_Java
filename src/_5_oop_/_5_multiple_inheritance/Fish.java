package _5_oop_._5_multiple_inheritance;

// 구현 클래스: Fish
public class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("The fish is swimming.");
    }
}