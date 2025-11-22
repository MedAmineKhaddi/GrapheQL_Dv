package ma.atelier.graphql_tp_devoir.services;

import ma.atelier.graphql_tp_devoir.dao.entities.Avion;
import ma.atelier.graphql_tp_devoir.dtos.AvionDtos;

import java.util.List;

//les methodes dans .GrapheQL
public interface AvionService {
    public List<AvionDtos> listAvions();

}
