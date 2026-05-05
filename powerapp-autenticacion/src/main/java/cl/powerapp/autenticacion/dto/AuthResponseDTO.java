package cl.powerapp.autenticacion.dto;

import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class AuthResponseDTO {
    private String token;
    private String tipo = "Bearer";
    private Long usuarioId;
    private String nombre;
    private String rol;
}
