package com.generation.blogpessoal.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
	
	@Bean
	OpenAPI springBlogPessoalOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Projeto Blog Pessoal")
						.description("Projeto Blog Pessoal - Generation Brasil")
						.version("v0.0.1")
						.license(new License()
								.name("Generation Brasil")
								.url ("htts://brazil.generation.org/"))
						.contact(new Contact()
								.name("Generation Brasil")
								.url("https://github.com/conteudoGeneration")
								.email("conteudogeneration@generation.org")))
				.externalDocs(new ExternalDocumentation()
						.description("Github")
						.url("http://github.com/conteudoGeneration/"));
		
						
	}

}
