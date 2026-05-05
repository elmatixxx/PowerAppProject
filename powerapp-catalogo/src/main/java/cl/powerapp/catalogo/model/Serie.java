package cl.powerapp.catalogo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity @Table(name = "series")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Serie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull private Long usuarioId;
    @NotNull private Long ejercicioId;
    @NotNull @Positive private Double peso;
    @NotNull @Positive private Integer repeticiones;
    @Min(0) @Max(5) private Integer rir;
    private String nota;
    private Double unRmEstimado;
    private LocalDateTime registradoEn;
    @PrePersist public void pre() { registradoEn = LocalDateTime.now(); }
}
