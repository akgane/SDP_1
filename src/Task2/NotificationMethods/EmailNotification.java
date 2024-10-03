package Task2.NotificationMethods;

import Task2.Interfaces.NotificationInterface;

public class EmailNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message, String userUID) {
        System.out.println("Email sent to " + userUID + "\nEmail text: " + message);
    }
}
