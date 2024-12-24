package _5_oop_._5_interface;

// 구현 클래스: PayPalPayment
public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
