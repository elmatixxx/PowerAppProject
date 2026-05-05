package cl.powerapp.planes.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;

@Entity @Table(name = "planes")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Plan {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank @Column(unique = true)
    private String nombre;
    @NotNull @Positive
    private BigDecimal precio;
    private String descripcion;
    private Integer duracionDias = 30;
    private Boolean activo = true;
}
