package cl.powerapp.soporte.service;

import cl.powerapp.soporte.dto.TicketRequestDTO;
import cl.powerapp.soporte.model.*;
import cl.powerapp.soporte.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SoporteService {

    private final TicketRepository ticketRepository;

    public TicketSoporte crearTicket(TicketRequestDTO dto) {
        // TODO: mapear DTO y persistir
        throw new UnsupportedOperationException("Implementar creacion de ticket");
    }

    public List<TicketSoporte> ticketsDeUsuario(Long usuarioId) {
        return ticketRepository.findByUsuarioId(usuarioId);
    }

    public List<TicketSoporte> abiertos() {
        return ticketRepository.findByEstado(EstadoTicket.ABIERTO);
    }

    public TicketSoporte asignar(Long ticketId, Long trabajadorId) {
        // TODO: asignar trabajador y cambiar estado a EN_PROCESO
        throw new UnsupportedOperationException("Implementar asignacion de ticket");
    }

    public TicketSoporte cerrar(Long ticketId) {
        // TODO: cambiar estado a RESUELTO
        throw new UnsupportedOperationException("Implementar cierre de ticket");
    }
}
