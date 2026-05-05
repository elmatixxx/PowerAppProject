package cl.powerapp.catalogo.dto;

import cl.powerapp.catalogo.model.NivelEjercicio;
import jakarta.validation.constraints.*;
import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class EjercicioDTO {
    private Long id;
    @NotBlank private String nombre;
    @NotBlank private String grupoMuscular;
    private String descripcion;
    private NivelEjercicio nivel;
    private String equipamiento;
}
