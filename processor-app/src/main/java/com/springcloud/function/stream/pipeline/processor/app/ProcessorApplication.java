package com.springcloud.function.stream.pipeline.processor.app;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class ProcessorApplication {

    @Bean
    public Function<Flux<String>, Flux<String>> uppercase() {
        return flux -> flux.map(value -> value.toUpperCase()).log();
    }

    public static void main(String[] args) {
        SpringApplication.run(ProcessorApplication.class, args);
    }
}