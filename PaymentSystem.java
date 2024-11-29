package javaoops;


interface Payment {
    void processPayment(double amount);
}

class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class UPI implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }
}

class BankTransferPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
    }
}


public class PaymentSystem {

	public static void main(String[] args) {

	Payment payment1 = new CreditCardPayment();
        payment1.processPayment(100.0);

        Payment payment2 = new UPI();
        payment2.processPayment(200.0);

        Payment payment3 = new BankTransferPayment();
        payment3.processPayment(300.0);

	}

}
