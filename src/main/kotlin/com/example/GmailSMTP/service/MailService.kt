package com.example.GmailSMTP.service

import com.example.GmailSMTP.dto.MailSender

interface MailService {

    fun sent(mailSender: MailSender)

}