import Task1.*;
import Task1.Interfaces.*;
import Task1.PaymentMethods.*;
import Task2.*;
import Task2.NotificationMethods.*;

public class Main {
    public static void main(String[] args) {
//        paymentTest();
        notificationTest();
    }

    static void paymentTest(){
        PaymentInterface payPal = new PayPalPayment();
        PaymentHandler payPalHandler = new PaymentHandler(payPal);
        payPalHandler.handlePayment(99.99);

        PaymentInterface creditCard = new CreditCardPayment();
        PaymentHandler creditCardHandler = new PaymentHandler(creditCard);
        creditCardHandler.handlePayment(42.42);

        PaymentInterface bankTransfer = new BankTransferPayment();
        PaymentHandler bankTransferHandler = new PaymentHandler(bankTransfer);
        bankTransferHandler.handlePayment(100);
    }

    static void notificationTest(){
        EmailNotification email = new EmailNotification();
        NotificationHandler emailHandler = new NotificationHandler(email);
        emailHandler.sendNotification("Advertising text", "230001@astanait.edu.kz");
        emailHandler.sendBulkNotification("Scholarship paid", new String[] {
                "230001@astanait.edu.kz", "230002@astanait.edu.kz", "230003@astanait.edu.kz"
        });

        PushNotification push = new PushNotification();
        NotificationHandler pushHandler = new NotificationHandler(push);
        pushHandler.sendNotification("New message from Whatsapp!", "4651894161842456");
//        pushHandler.sendBulkNotification("New message from Whatsapp!", new String[] {
//                "4651825681842456", "4659914161842456", "4651894169201674"
//        });

        SlackNotification slack = new SlackNotification();
        NotificationHandler slackHandler = new NotificationHandler(slack);
        slackHandler.sendNotification("Some slack notification (idk what it is)", "suu-3056175");
//        slackHandler.sendBulkNotification("Some slack notification", new String[] {
//                "suu-305111", "suu-220862", "su-005165"
//        });

        SMSNotification sms = new SMSNotification();
        NotificationHandler smsHandler = new NotificationHandler(sms);
        smsHandler.sendNotification("Weather for tomorrow - sunny", "+77777777777");
//        smsHandler.sendBulkNotification("Weather for tomorrow - rainy", new String[] {
//                "+77777777777", "+77770000001", "88005553535"
//        });
    }
}