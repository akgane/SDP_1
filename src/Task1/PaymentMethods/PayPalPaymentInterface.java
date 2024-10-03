package Task1.PaymentMethods;

import Task1.Interfaces.PaymentInterface;

public class PayPalPaymentInterface implements PaymentInterface {

    @Override
    public void GetPayment(double amount) {
        System.out.println("Payment through PayPal for " + amount + "$ was accepted!");
    }
}
