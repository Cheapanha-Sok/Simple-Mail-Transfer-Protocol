package com.example.GmailSMTP.dto

data class MailSender (
    var sentTo :String,
    var subject :String,
    var message :String,
)