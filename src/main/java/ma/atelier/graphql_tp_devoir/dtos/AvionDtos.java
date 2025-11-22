package ma.atelier.graphql_tp_devoir.dtos;

import lombok.*;

@Builder
@NoArgsConstructor @AllArgsConstructor
@Data
public class AvionDtos {
    private Long id;
    private String model;
    private String color;
    private String matricul;
    private double price;
}
