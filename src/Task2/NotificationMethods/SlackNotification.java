package Task2.NotificationMethods;

import Task2.Interfaces.NotificationInterface;

public class SlackNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message, String userUID) {
        System.out.println("Slack notification sent to " + userUID + ": " + message);
    }
}
