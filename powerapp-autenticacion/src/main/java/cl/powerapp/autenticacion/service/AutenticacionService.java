package cl.powerapp.autenticacion.service;

import cl.powerapp.autenticacion.dto.*;
import cl.powerapp.autenticacion.model.Usuario;
import cl.powerapp.autenticacion.repository.UsuarioRepository;
import cl.powerapp.autenticacion.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AutenticacionService {

    private final UsuarioRepository usuarioRepository;

    public AuthResponseDTO registrar(RegisterRequestDTO dto) {
        // TODO: cifrar password con BCryptPasswordEncoder
        // TODO: generar JWT y retornar AuthResponseDTO
        throw new UnsupportedOperationException("Implementar registro con BCrypt y JWT");
    }

    public AuthResponseDTO login(LoginRequestDTO dto) {
        // TODO: validar credenciales y generar JWT
        throw new UnsupportedOperationException("Implementar login con BCrypt y JWT");
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado: " + id));
    }
}
