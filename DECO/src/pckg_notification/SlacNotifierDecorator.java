package pckg_notification;

public class SlacNotifierDecorator extends NotifierDecorator {
    protected SlacNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String msg) {
        notifier.sendMessage(msg);
        System.out.println("SLACK: sending message: " + msg);
    }
}
