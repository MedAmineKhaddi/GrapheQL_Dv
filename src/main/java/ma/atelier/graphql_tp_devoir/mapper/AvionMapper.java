package ma.atelier.graphql_tp_devoir.mapper;

import lombok.*;
import ma.atelier.graphql_tp_devoir.dao.repositories.AvionRepository;
import ma.atelier.graphql_tp_devoir.dao.entities.Avion;
import ma.atelier.graphql_tp_devoir.dtos.AvionDtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AvionMapper {

    private AvionRepository  avionRepository;
    public AvionDtos fromAvion(Avion avion) {
       return AvionDtos.builder()
                .color(avion.getColor())
                .model(avion.getModel())
                .price(avion.getPrice())
                .matricul(avion.getMatricul())
                .build();
    }
    public Avion toAvion(AvionDtos avionDtos) {
        Avion avion = new   Avion();
        avion.setColor(avionDtos.getColor());
        avion.setModel(avionDtos.getModel());
        avion.setPrice(avionDtos.getPrice());
        avion.setMatricul(avionDtos.getMatricul());
        return avionRepository.save(avion);

    }
}
