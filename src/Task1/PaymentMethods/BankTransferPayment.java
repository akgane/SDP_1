package Task1.PaymentMethods;

import Task1.Interfaces.PaymentInterface;

public class BankTransferPayment implements PaymentInterface {

    @Override
    public void GetPayment(double amount) {
        System.out.println("Bank transfer payment was accepted. Transfer amount: " + amount + "$");
    }
}
