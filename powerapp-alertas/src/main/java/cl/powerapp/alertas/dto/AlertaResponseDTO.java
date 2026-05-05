package cl.powerapp.alertas.dto;

import cl.powerapp.alertas.model.TipoAlerta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlertaResponseDTO {

    private Long id;
    private Long usuarioId;
    private String titulo;
    private String contenido;
    private TipoAlerta tipo;
    private Boolean leida;
    private LocalDateTime creadoEn;
}
