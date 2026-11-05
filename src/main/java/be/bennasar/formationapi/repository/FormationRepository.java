package be.bennasar.formationapi.repository;
import be.bennasar.formationapi.entity.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation, Long> {

}
