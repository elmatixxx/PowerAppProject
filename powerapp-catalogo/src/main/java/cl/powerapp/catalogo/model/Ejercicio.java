package cl.powerapp.catalogo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity @Table(name = "ejercicios")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Ejercicio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank @Column(nullable = false)
    private String nombre;
    @NotBlank
    private String grupoMuscular;
    private String descripcion;
    @Enumerated(EnumType.STRING)
    private NivelEjercicio nivel;
    private String equipamiento;
    private Boolean activo = true;
}
