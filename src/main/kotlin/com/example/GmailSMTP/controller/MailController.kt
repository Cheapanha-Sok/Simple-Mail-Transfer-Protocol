package com.example.GmailSMTP.controller

import com.example.GmailSMTP.dto.MailSender
import com.example.GmailSMTP.service.MailService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/v1/mail")
class MailController(
    private var mailService: MailService
) {
    @PostMapping
    fun sentMail(@RequestBody mailSender: MailSender){
        mailService.sent(mailSender)
    }
}