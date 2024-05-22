package edu.mum.cs.cs525.labs.exercises.project.accountparty.notification;

public class EmailSender implements Observer {

    private static EmailSender INSTANCE;
    private EmailSender() {}

    public static EmailSender getInstance() {
        if (INSTANCE == null)
            INSTANCE = new EmailSender();
        return INSTANCE;
    }
    @Override
    public void send(String accountEmail, String message) {
        if (accountEmail.isEmpty())
            return;
        System.out.println("Email sent to " + accountEmail + " with message: " + message);
    }
}
