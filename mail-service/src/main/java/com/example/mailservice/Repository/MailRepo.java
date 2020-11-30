package com.example.mailservice.Repository;

import com.example.mailservice.Mail.Mail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailRepo extends MongoRepository<Mail,String> {

}
