package com.br.cadastro.endereco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EnderecoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnderecoApplication.class, args);
    }
}
