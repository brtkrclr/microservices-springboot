package com.example.mailservice.Controller;

import com.example.mailservice.Mail.Mail;
import com.example.mailservice.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MailController {

    @Autowired
    private MailService mailService;

    @RequestMapping(value = "/mail/create",method = RequestMethod.POST)
    public Mail createMail(@RequestBody  Mail mail){
        return mailService.save(mail);
    }

    @RequestMapping(value = "/mail/all", method = RequestMethod.GET)
    public List<Mail> getAllCustomers() {
        return mailService.getAll();
    }
    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    public String send(@PathVariable String id) {
        mailService.send(id);
        return id + " is sent";
    }

}
