package com.springcloud.function.stream.pipeline.source.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Uncomment to use UploadPojoData Source
 * 
 * @EnableBinding(Source.class)
 * @Import(PipelineDocument.class)
 * @EnableAutoConfiguration
 */
@SpringBootApplication
public class SourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SourceApplication.class, args);
    }

}