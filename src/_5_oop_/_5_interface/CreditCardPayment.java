package _5_oop_._5_interface;

// 구현 클래스: CreditCardPayment
public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}