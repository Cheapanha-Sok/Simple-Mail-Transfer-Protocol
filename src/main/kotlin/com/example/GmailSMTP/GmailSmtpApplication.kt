package com.example.GmailSMTP

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GmailSmtpApplication

fun main(args: Array<String>) {
	runApplication<GmailSmtpApplication>(*args)
}
