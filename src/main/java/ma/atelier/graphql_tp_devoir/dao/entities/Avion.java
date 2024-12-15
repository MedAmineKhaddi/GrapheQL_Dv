package ma.atelier.graphql_tp_devoir.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Builder
public class Avion {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_Avion;
    private String model;
    private String color;
    private String matricul;
    private double price;
}