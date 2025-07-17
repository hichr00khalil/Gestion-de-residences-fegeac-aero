package esprit.example.fegaac1.repository;

import esprit.example.fegaac1.entities.Appartement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppartementRepository extends JpaRepository<Appartement, Long> {
}
