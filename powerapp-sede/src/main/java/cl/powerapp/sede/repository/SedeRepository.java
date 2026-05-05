package cl.powerapp.sede.repository;

import cl.powerapp.sede.model.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SedeRepository extends JpaRepository<Sede, Long> {
    List<Sede> findByActivoTrue();
}
