package cl.powerapp.sede.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity @Table(name = "sedes")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Sede {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank private String nombre;
    @NotBlank private String direccion;
    private String horario;
    private Integer capacidadMaxima;
    private Integer ocupacionActual = 0;
    private Boolean activo = true;
    private Double latitud;
    private Double longitud;
}
