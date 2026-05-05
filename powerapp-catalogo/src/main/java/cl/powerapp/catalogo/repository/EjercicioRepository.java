package cl.powerapp.catalogo.repository;

import cl.powerapp.catalogo.model.Ejercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EjercicioRepository extends JpaRepository<Ejercicio, Long> {
    List<Ejercicio> findByGrupoMuscularIgnoreCase(String grupoMuscular);
    List<Ejercicio> findByActivoTrue();
}
