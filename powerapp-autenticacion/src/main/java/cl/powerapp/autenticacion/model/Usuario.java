package cl.powerapp.autenticacion.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String nombre;

    @Email @NotBlank
    @Column(unique = true, nullable = false)
    private String correo;

    @NotBlank
    @Column(nullable = false)
    private String passwordHash;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RolUsuario rol = RolUsuario.ATLETA;

    @Column(nullable = false)
    private Boolean activo = true;

    private LocalDateTime creadoEn;
    private LocalDateTime ultimoAcceso;

    @PrePersist
    public void prePersist() { this.creadoEn = LocalDateTime.now(); }
}
