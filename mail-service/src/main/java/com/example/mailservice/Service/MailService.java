package com.example.mailservice.Service;

import com.example.mailservice.Mail.Mail;

import java.util.List;

public interface MailService {
    Mail save(Mail mail);
    List<Mail> getAll();
    void send(String id);
}
