package pe.edu.pucp.gtics.lab1221.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pucp.gtics.lab1221.entity.Distributors;

@Repository
public interface DistributorsRepository extends JpaRepository<Distributors, Integer> {

}
