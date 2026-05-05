package cl.powerapp.resena.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity @Table(name = "resenas")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Resena {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull private Long usuarioId;
    @NotNull private Long ejercicioId;
    @Min(1) @Max(5) private Integer calificacion;
    private String comentario;
    private LocalDateTime creadoEn;
    @PrePersist public void pre() { creadoEn = LocalDateTime.now(); }
}
