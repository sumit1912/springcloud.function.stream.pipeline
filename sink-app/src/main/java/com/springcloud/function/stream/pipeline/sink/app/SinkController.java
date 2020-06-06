package com.springcloud.function.stream.pipeline.sink.app;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.springcloud.function.stream.pipeline.core.PipelineDocument;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Component
@Slf4j
public class SinkController {

    @Bean
    public Consumer<Flux<PipelineDocument>> log() {
        return pipelineDocument -> {
            pipelineDocument.subscribe(
                    doc -> LOGGER.info("Received doc with id: {} and content: {}", doc.getId(), doc.getContent()));
        };
    }
}
