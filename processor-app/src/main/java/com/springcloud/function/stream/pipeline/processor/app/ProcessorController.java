package com.springcloud.function.stream.pipeline.processor.app;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.springcloud.function.stream.pipeline.core.PipelineDocument;

import reactor.core.publisher.Flux;

@Component
public class ProcessorController {

    @Bean
    public Function<Flux<PipelineDocument>, Flux<PipelineDocument>> uppercase() {
        return pipelineDocument -> pipelineDocument.map(doc -> doc.setContent(doc.getContent().toUpperCase())).log();
    }
}
