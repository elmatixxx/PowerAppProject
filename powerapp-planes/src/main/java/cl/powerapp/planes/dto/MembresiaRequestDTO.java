package cl.powerapp.planes.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor
public class MembresiaRequestDTO {
    @NotNull private Long usuarioId;
    @NotNull private Long planId;
}
