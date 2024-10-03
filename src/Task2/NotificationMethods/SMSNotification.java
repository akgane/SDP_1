package Task2.NotificationMethods;

import Task2.Interfaces.NotificationInterface;

public class SMSNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message, String userUID) {
        System.out.println("SMS to user with id " + userUID + " has sent.\nSMS text: " + message);
    }
}
