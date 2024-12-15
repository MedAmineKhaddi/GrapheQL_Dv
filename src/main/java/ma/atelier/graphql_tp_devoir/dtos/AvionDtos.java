package ma.atelier.graphql_tp_devoir.dtos;

import lombok.*;

@Builder
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class AvionDtos {
    private String model;
    private String color;
    private String matricul;
    private double price;
}
