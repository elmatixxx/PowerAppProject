package cl.powerapp.pagos.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity @Table(name = "pagos")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Pago {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long usuarioId;
    private Long membresiaId;
    private BigDecimal monto;
    @Enumerated(EnumType.STRING)
    private EstadoPago estado = EstadoPago.PENDIENTE;
    private String metodoPago;
    private String referenciaPasarela;
    private LocalDateTime creadoEn;
    private LocalDateTime procesadoEn;
    @PrePersist public void pre() { creadoEn = LocalDateTime.now(); }
}
