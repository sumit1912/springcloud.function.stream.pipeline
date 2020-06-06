package com.springcloud.function.stream.pipeline.source.app;

import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;

@Component
public class UploadStringData {

    @Bean
    public Supplier<Flux<String>> stringSupplier() {
        return () -> {
            return Flux.just("abc", "def", "xyz");
        };
    }
}
