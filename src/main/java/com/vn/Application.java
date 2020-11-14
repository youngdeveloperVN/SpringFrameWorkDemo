package com.vn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunne(ApplicationContext ctx) {
//		return args -> {
//			String[]  beans = ctx.getBeanDefinitionNames();
//			for (String string : beans) {
//				System.out.println(string);
//			}
//		};
//	}
}
