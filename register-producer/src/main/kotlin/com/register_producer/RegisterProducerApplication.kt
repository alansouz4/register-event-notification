package com.register_producer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RegisterProducerApplication

fun main(args: Array<String>) {
	runApplication<RegisterProducerApplication>(*args)
    println("Bem vindo ao projeto de eventos de cadastro")
}
