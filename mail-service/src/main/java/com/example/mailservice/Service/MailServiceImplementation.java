package com.example.mailservice.Service;

import com.example.mailservice.Mail.Mail;
import com.example.mailservice.Repository.MailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailServiceImplementation  implements  MailService{

    private MailRepo mailRepo;

    @Autowired
    public MailServiceImplementation (MailRepo mailRepo){
        this.mailRepo=mailRepo;
    }

    @Override
    public Mail save(Mail mail) {
        mailRepo.save(mail);
        return mail;
    }

    @Override
    public List<Mail> getAll() {
        return (List<Mail>) mailRepo.findAll();
    }

    @Override
    public void send(String id) {
    mailRepo.deleteById(id);
    }
}
