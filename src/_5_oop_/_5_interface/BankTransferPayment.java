package _5_oop_._5_interface;

// 구현 클래스: BankTransferPayment
public class BankTransferPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
    }
}