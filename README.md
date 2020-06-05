# springcloud.function.stream.pipeline

This project creates Spring cloud stream apps (Source/Processor/Sink) using Functions(Supplier/Function/Consumer).

The source-app generates Flux of String puts it on Message channel to be consumed by processor-app.

processor-app converts the Flux of String data to upper case and just passes it.

sink-app accepts the Flux of String and logs it.

These applications are designed to run on SCDF with RabbitMQ message broker.

The source-app can be triggered by calling HTTP GET at the PORT it is running. For e.g.: http://localhost:source-app-PORT
 
