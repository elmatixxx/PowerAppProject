package cl.powerapp.soporte.repository;

import cl.powerapp.soporte.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TicketRepository extends JpaRepository<TicketSoporte, Long> {
    List<TicketSoporte> findByUsuarioId(Long usuarioId);
    List<TicketSoporte> findByEstado(EstadoTicket estado);
    List<TicketSoporte> findByTrabajadorAsignadoId(Long trabajadorId);
    List<TicketSoporte> findByEstadoAndPrioridad(EstadoTicket estado, PrioridadTicket prioridad);
}
