package ma.atelier.graphql_tp_devoir.services;

import lombok.*;
import ma.atelier.graphql_tp_devoir.dao.entities.Avion;
import ma.atelier.graphql_tp_devoir.dao.repositories.AvionRepository;
import ma.atelier.graphql_tp_devoir.dtos.AvionDtos;
import ma.atelier.graphql_tp_devoir.mapper.AvionMapper;

import java.util.List;
@Builder
@NoArgsConstructor
@Getter
@Setter

public class AvionManager implements AvionService{

    private AvionRepository avionRepository;
    final private AvionMapper avionMapper = new AvionMapper();
    public AvionManager( AvionRepository avionRepository ) {
        this.avionRepository = avionRepository;
    }


    @Override
    public List<AvionDtos> listAvions() {
        List<Avion> avions = avionRepository.findAll() ;
        return avions.stream().map(avionMapper::fromAvion).toList();


    }

    @Override
    public AvionDtos getAvionByModel(String model) {
        return null;
    }

    @Override
    public AvionDtos getAvionByModelAndPrice(String model, double price) {
        return null;
    }

    @Override
    public AvionDtos saveAvion(AvionDtos avion) {
        return null;
    }

    @Override
    public AvionDtos deleteAvion(String matricule) {
        return null;
    }
}
