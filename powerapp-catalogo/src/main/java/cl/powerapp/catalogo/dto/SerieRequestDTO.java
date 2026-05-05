package cl.powerapp.catalogo.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor
public class SerieRequestDTO {
    @NotNull private Long usuarioId;
    @NotNull private Long ejercicioId;
    @NotNull @Positive private Double peso;
    @NotNull @Positive private Integer repeticiones;
    @Min(0) @Max(5) private Integer rir;
    private String nota;
}
