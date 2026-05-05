package cl.powerapp.pagos.dto;

import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;

@Data @NoArgsConstructor @AllArgsConstructor
public class PagoRequestDTO {
    @NotNull private Long usuarioId;
    @NotNull private Long membresiaId;
    @NotNull @Positive private BigDecimal monto;
    @NotBlank private String metodoPago;
}
