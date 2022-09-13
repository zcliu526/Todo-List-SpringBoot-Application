package com.zcliu.todoapplication.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {

    @Value("smtp.gmail.com")
    private String host;

    @Value("587")
    private Integer port;

    public JavaMailSender javaMailSender(){
        JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();
        javaMailSenderImpl.setHost(host);
        javaMailSenderImpl.setPort(port);

        return javaMailSenderImpl;
    }
}
