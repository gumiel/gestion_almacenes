package com.gestion.almacenes;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AlmacenesApplication {

  public static void main(String[] args) {
    SpringApplication.run(AlmacenesApplication.class, args);
  }

  @Bean
  public OpenAPI customOpenApi() {
    return new OpenAPI()
        .info(
            new Info()
                .title("Documentacion de API-REST de la GESTION DE ALMACENES")
                .version("1.0")
                .description(
                    "Esta es una pequeña documentacion para los endpoints del programa de Gestion de almacenes")
        );
  }

}
