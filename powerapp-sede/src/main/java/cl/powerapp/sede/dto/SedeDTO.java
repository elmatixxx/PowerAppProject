package cl.powerapp.sede.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class SedeDTO {
    private Long id;
    @NotBlank private String nombre;
    @NotBlank private String direccion;
    private String horario;
    private Integer capacidadMaxima;
    private Integer ocupacionActual;
    private Double latitud;
    private Double longitud;
}
