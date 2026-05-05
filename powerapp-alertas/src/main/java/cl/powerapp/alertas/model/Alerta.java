package cl.powerapp.alertas.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity @Table(name = "alertas")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Alerta {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long usuarioId;
    @Enumerated(EnumType.STRING)
    private TipoAlerta tipo;
    private String titulo;
    private String contenido;
    private Boolean leida = false;
    private LocalDateTime creadoEn;
    @PrePersist public void pre() { creadoEn = LocalDateTime.now(); }
}
