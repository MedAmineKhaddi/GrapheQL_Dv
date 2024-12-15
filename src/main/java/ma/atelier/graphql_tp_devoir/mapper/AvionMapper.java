package ma.atelier.graphql_tp_devoir.mapper;

import lombok.*;
import ma.atelier.graphql_tp_devoir.dao.entities.Avion;
import ma.atelier.graphql_tp_devoir.dtos.AvionDtos;
@Builder
@AllArgsConstructor @NoArgsConstructor
@Getter
@Setter
public class AvionMapper {
    public AvionDtos fromAvion(Avion avion) {
       return AvionDtos.builder()
                .color(avion.getColor())
                .model(avion.getModel())
                .price(avion.getPrice())
                .matricul(avion.getMatricul())
                .build();


    }
}
