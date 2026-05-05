package cl.powerapp.planes.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity @Table(name = "membresias")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Membresia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long usuarioId;
    @ManyToOne @JoinColumn(name = "plan_id")
    private Plan plan;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    @Enumerated(EnumType.STRING)
    private EstadoMembresia estado = EstadoMembresia.ACTIVA;
}
