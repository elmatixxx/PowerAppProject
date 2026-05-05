package cl.powerapp.logros.repository;

import cl.powerapp.logros.model.LogroUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LogroUsuarioRepository extends JpaRepository<LogroUsuario, Long> {
    List<LogroUsuario> findByUsuarioId(Long usuarioId);
}
