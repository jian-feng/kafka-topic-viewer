package jp.co.monoplus.kafka.poc;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class RestConfigurator extends RouteBuilder {

	@Autowired
	Environment environment;

	@Override
	public void configure() throws Exception {
		restConfiguration()
		.component("servlet")
		.host(environment.getProperty("camelrest.host"))
		.port(environment.getProperty("camelrest.port"))
		.contextPath(environment.getProperty("camelrest.contextPath"))
		.bindingMode(RestBindingMode.json)
		.apiComponent("swagger")
		.apiContextPath("/api-docs")
		.enableCORS(true)
		.dataFormatProperty("prettyPrint", "true")
		.apiProperty("api.title", "Monoplus Kafka PoC REST API")
		.apiProperty("api.version", "0.0.1-SNAPSHOT")
		.apiProperty("api.description", "Kafka検証用サンプルAPI");
	}


}
