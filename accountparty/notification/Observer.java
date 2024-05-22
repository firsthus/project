package edu.mum.cs.cs525.labs.exercises.project.accountparty.notification;

public interface Observer {
    void send(String accountEmail, String message);
}
