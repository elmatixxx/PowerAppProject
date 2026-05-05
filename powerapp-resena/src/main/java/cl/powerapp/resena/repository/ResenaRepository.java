package cl.powerapp.resena.repository;

import cl.powerapp.resena.model.Resena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ResenaRepository extends JpaRepository<Resena, Long> {
    List<Resena> findByEjercicioId(Long ejercicioId);
    @Query("SELECT AVG(r.calificacion) FROM Resena r WHERE r.ejercicioId = :ejercicioId")
    Double promedioCalificacion(Long ejercicioId);
}
