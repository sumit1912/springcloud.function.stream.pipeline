package com.springcloud.function.stream.pipeline.sink.app;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class SinkApplication {
    public static void main(String[] args) {
        SpringApplication.run(SinkApplication.class, args);
    }

    @Bean
    public Consumer<Flux<String>> log() {
        return flux -> {
            flux.subscribe(f -> System.out.println("Received data: " + f));
        };
    }
}