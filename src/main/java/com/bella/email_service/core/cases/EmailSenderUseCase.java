package com.bella.email_service.core.cases;

public interface EmailSenderUseCase {

    void sendEmail(String to, String subject, String body);

}