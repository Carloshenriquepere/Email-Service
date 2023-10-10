package com.project.emailservice.core;

public record EmailRequest(String toEmail, String subject, String body) {
}
