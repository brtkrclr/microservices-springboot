package com.example.mailservice.Mail;

public class Mail {
    private final String to;
    private final String subject;


    public Mail(String to, String subject) {
        this.to = to;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public String getTo() {
        return to;
    }

}
