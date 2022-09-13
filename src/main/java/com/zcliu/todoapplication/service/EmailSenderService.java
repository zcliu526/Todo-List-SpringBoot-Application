package com.zcliu.todoapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;
}
