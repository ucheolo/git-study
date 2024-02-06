package com.example.gitstrudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Clock;

@SpringBootApplication
public class GitStrudyApplication {

    public static void main(String[] args) {
        System.out.println("new line");
        System.out.println("");
        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
        SpringApplication.run(GitStrudyApplication.class, args);
    }

}
