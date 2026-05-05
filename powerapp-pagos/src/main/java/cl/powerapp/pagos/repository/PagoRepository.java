package cl.powerapp.pagos.repository;

import cl.powerapp.pagos.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PagoRepository extends JpaRepository<Pago, Long> {
    List<Pago> findByUsuarioId(Long usuarioId);
    List<Pago> findByEstado(EstadoPago estado);
}
