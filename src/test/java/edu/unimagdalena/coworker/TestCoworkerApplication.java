package edu.unimagdalena.coworker;

import org.springframework.boot.SpringApplication;

public class TestCoworkerApplication {

    public static void main(String[] args) {
        SpringApplication.from(CoworkerApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
