package cl.powerapp.alertas.dto;

import cl.powerapp.alertas.model.TipoAlerta;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlertaRequestDTO {

    @NotNull(message = "El id de usuario es obligatorio")
    private Long usuarioId;

    @NotBlank(message = "El titulo es obligatorio")
    private String titulo;

    @NotBlank(message = "El contenido es obligatorio")
    private String contenido;

    @NotNull(message = "El tipo de alerta es obligatorio")
    private TipoAlerta tipo;
}
