package cl.powerapp.planes.repository;

import cl.powerapp.planes.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface MembresiaRepository extends JpaRepository<Membresia, Long> {
    Optional<Membresia> findByUsuarioIdAndEstado(Long usuarioId, EstadoMembresia estado);
    List<Membresia> findByEstado(EstadoMembresia estado);
}
