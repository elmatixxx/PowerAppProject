package cl.powerapp.resena.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor
public class ResenaRequestDTO {
    @NotNull private Long usuarioId;
    @NotNull private Long ejercicioId;
    @Min(1) @Max(5) private Integer calificacion;
    private String comentario;
}
