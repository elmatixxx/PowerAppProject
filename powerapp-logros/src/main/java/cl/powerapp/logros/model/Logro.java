package cl.powerapp.logros.model;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name = "logros")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Logro {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private String icono;
    private Integer condicionValor;
    @Enumerated(EnumType.STRING)
    private TipoCondicion tipoCondicion;
}
