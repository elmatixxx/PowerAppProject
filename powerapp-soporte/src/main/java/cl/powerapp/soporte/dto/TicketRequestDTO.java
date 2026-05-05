package cl.powerapp.soporte.dto;

import cl.powerapp.soporte.model.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor
public class TicketRequestDTO {
    @NotNull private Long usuarioId;
    @NotBlank private String titulo;
    @NotBlank private String descripcion;
    private CategoriaTicket categoria;
    private PrioridadTicket prioridad;
}
