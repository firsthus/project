package edu.mum.cs.cs525.labs.exercises.project.accountparty.notification;

public class EmailSender implements Observer {
    @Override
    public void send(String accountEmail, String message) {
        if (accountEmail.isEmpty())
            return;
        System.out.println("Email sent to " + accountEmail + " with message: " + message);
    }
}
