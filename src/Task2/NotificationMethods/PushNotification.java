package Task2.NotificationMethods;

import Task2.Interfaces.NotificationInterface;

public class PushNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message, String userUID) {
        System.out.println("Push notification for user " + userUID + ": " + message);
    }
}
