package cl.powerapp.logros.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity @Table(name = "logros_usuarios")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class LogroUsuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long usuarioId;
    @ManyToOne @JoinColumn(name = "logro_id")
    private Logro logro;
    private LocalDateTime obtenidoEn;
}
