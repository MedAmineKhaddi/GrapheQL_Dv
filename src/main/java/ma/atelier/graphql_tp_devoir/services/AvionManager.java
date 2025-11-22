package ma.atelier.graphql_tp_devoir.services;

import lombok.*;
import ma.atelier.graphql_tp_devoir.dao.entities.Avion;
import ma.atelier.graphql_tp_devoir.dao.repositories.AvionRepository;
import ma.atelier.graphql_tp_devoir.dtos.AvionDtos;
import ma.atelier.graphql_tp_devoir.mapper.AvionMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AvionManager implements AvionService{

   final private AvionRepository avionRepository;
    final private AvionMapper avionMapper = new AvionMapper();
    public AvionManager( AvionRepository avionRepository ) {
        this.avionRepository = avionRepository;
    }


    @Override
    public List<AvionDtos> listAvions() {
        return avionRepository.findAll()
                .stream()
                .map(avion -> {
                    AvionDtos dto = new AvionDtos();
                    dto.setId(avion.getId_Avion());
                    dto.setMatricul(avion.getMatricul());
                    dto.setColor(avion.getColor());
                    dto.setModel(avion.getModel());
                    return dto;
                })
                .toList();
    }



}
