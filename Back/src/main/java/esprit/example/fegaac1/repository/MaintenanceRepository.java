package esprit.example.fegaac1.repository;

import esprit.example.fegaac1.entities.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
}
