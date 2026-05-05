package cl.powerapp.catalogo.repository;

import cl.powerapp.catalogo.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SerieRepository extends JpaRepository<Serie, Long> {
    List<Serie> findByUsuarioIdAndEjercicioIdOrderByRegistradoEnDesc(Long usuarioId, Long ejercicioId);
    List<Serie> findByUsuarioIdOrderByRegistradoEnDesc(Long usuarioId);
}
