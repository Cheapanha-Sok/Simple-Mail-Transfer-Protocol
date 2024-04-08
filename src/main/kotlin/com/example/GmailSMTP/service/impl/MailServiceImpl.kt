package com.example.GmailSMTP.service.impl

import com.example.GmailSMTP.dto.MailSender
import com.example.GmailSMTP.service.MailService
import org.springframework.beans.factory.annotation.Value
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service

@Service
class MailServiceImpl(
    private val javaMailSender: JavaMailSender
) : MailService {

    @Value("\${spring.mail.username}")
    private var username: String ?=null

    override fun sent(mailSender: MailSender) {
        val simpleMailMessage = SimpleMailMessage()
        simpleMailMessage.from = username
        simpleMailMessage.subject = mailSender.subject
        simpleMailMessage.text = mailSender.message
        simpleMailMessage.setTo(mailSender.sentTo)
        javaMailSender.send(simpleMailMessage)
    }
}