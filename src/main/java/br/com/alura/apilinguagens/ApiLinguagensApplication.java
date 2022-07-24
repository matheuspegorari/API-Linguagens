package br.com.alura.apilinguagens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiLinguagensApplication {

    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "false");

        SpringApplication.run(ApiLinguagensApplication.class, args);
    }

}
