package cl.powerapp.autenticacion.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor
public class LoginRequestDTO {

    @Email @NotBlank
    private String correo;

    @NotBlank
    private String password;
}
