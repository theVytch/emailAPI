package com.eduardo.email.emailAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailApiApplication {

	@Autowired
	private SendEmailService sendEmailService;

	public static void main(String[] args) {
		SpringApplication.run(EmailApiApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void starting(){
		sendEmailService.sendEmail("Email da pessoa","corpo","titulo");
	}
}
