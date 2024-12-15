package ma.atelier.graphql_tp_devoir.dao.repositories;

import ma.atelier.graphql_tp_devoir.dao.entities.Avion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AvionRepository extends JpaRepository<Avion, Long> {

}
