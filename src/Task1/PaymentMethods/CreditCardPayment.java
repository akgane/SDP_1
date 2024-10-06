package Task1.PaymentMethods;

import Task1.Interfaces.PaymentInterface;

public class CreditCardPayment implements PaymentInterface {

    @Override
    public void GetPayment(double amount) {
        System.out.println("Payment through credit card was accepted. Payment amount: " + amount + "$");
    }
}
