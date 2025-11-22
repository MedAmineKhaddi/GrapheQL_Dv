package ma.atelier.graphql_tp_devoir;

import ma.atelier.graphql_tp_devoir.dao.entities.Avion;
import ma.atelier.graphql_tp_devoir.dao.repositories.AvionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class GraphQlTpDevoirApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphQlTpDevoirApplication.class, args);
    }

    @Bean
    CommandLineRunner start (AvionRepository avionRepository) {
        return args -> {

                Avion avion1=Avion.builder().Id_Avion(1L)
                        .color("Rouge")
                        .model("773")
                        .matricul("2354")
                        .price(3200.00)
                        .build();
                avionRepository.save(avion1);

        };
    }

}
