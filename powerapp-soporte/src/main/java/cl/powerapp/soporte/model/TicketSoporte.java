package cl.powerapp.soporte.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity @Table(name = "tickets_soporte")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class TicketSoporte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull private Long usuarioId;
    private Long trabajadorAsignadoId;
    @NotBlank private String titulo;
    @NotBlank private String descripcion;
    @Enumerated(EnumType.STRING)
    private CategoriaTicket categoria;
    @Enumerated(EnumType.STRING)
    private EstadoTicket estado = EstadoTicket.ABIERTO;
    @Enumerated(EnumType.STRING)
    private PrioridadTicket prioridad = PrioridadTicket.NORMAL;
    private LocalDateTime creadoEn;
    private LocalDateTime actualizadoEn;
    @PrePersist public void pre() { creadoEn = LocalDateTime.now(); actualizadoEn = LocalDateTime.now(); }
    @PreUpdate public void preUpdate() { actualizadoEn = LocalDateTime.now(); }
}
