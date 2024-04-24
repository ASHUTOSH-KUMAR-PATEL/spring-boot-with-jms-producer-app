package com.irshu.JMSProducerApp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MessageSender { //implements CommandLineRunner 

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${my.mq.destination-name}")
    private String destinationName;

    @Scheduled(cron = "0 35 10 * * ?", zone = "IST")
    public void send() {
        jmsTemplate.send(destinationName, session -> session.createTextMessage("Hello from Producer => " + new Date()));
    }

    /*@Override
    public void run(String... args) throws Exception {
        jmsTemplate.send(destinationName, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage("Hello from Producer => " + new Date());
                return textMessage;
            }
        });*/

}
