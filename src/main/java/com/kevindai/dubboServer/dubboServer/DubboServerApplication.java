package com.kevindai.dubboServer.dubboServer;

import com.kevindai.dubbo.ConsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("com.kevindai")
@ImportResource("classpath:dubbo-consumer.xml")
public class DubboServerApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DubboServerApplication.class, args);
		ConfigurableApplicationContext run = SpringApplication.run(DubboServerApplication.class, args);
		ConsumerService consumerService = run.getBean(ConsumerService.class);
		consumerService.showMsg("aabbcc");
	}
}
