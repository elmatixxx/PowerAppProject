package cl.powerapp.planes.dto;

import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class PlanDTO {
    private Long id;
    @NotBlank private String nombre;
    @NotNull @Positive private BigDecimal precio;
    private String descripcion;
    private Integer duracionDias;
}
