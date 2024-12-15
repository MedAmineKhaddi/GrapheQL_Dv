package ma.atelier.graphql_tp_devoir.Controller;

import lombok.*;
import ma.atelier.graphql_tp_devoir.dao.entities.Avion;
import ma.atelier.graphql_tp_devoir.dao.repositories.AvionRepository;
import ma.atelier.graphql_tp_devoir.dtos.AvionDtos;
import ma.atelier.graphql_tp_devoir.services.AvionManager;
import org.springframework.data.jpa.repository.Query;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Controller
public class AvionGraphGLController {

    private AvionManager avionManager;
    private AvionRepository avionRepository;

    public AvionGraphGLController(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
        this.avionManager = new AvionManager(avionRepository);


    }
    @QueryMapping
    public List<AvionDtos> listeAvion() {
        return avionManager.listAvions();
    }

}
