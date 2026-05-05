package cl.powerapp.pagos.dto;

import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class PagoResponseDTO {
    private Long id;
    private Long usuarioId;
    private BigDecimal monto;
    private String estado;
    private String referenciaPasarela;
    private LocalDateTime procesadoEn;
}
