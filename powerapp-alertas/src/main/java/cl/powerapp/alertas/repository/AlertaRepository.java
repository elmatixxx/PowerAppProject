package cl.powerapp.alertas.repository;

import cl.powerapp.alertas.model.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlertaRepository extends JpaRepository<Alerta, Long> {

    List<Alerta> findByUsuarioIdOrderByCreadoEnDesc(Long usuarioId);

    List<Alerta> findByUsuarioIdAndLeidaFalse(Long usuarioId);
}
