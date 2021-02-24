/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.jalasoft.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        System.out.println(new App().getGreeting());
        SpringApplication.run(App.class, args);
    }

    public String getGreeting() {
        return "Hello World!";
    }
}