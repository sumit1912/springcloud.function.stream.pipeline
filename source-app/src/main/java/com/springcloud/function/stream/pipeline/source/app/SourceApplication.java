package com.springcloud.function.stream.pipeline.source.app;

import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class SourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SourceApplication.class, args);
    }

    @Bean
    public Supplier<Flux<String>> stringSupplier() {
        return () -> {
            String v1 = String.valueOf("abc");
            String v2 = String.valueOf("pqr");
            String v3 = String.valueOf("xyz");
            return Flux.just(v1, v2, v3);
        };
    }
}