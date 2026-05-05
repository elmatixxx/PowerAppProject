package cl.powerapp.logros.service;

import cl.powerapp.logros.model.*;
import cl.powerapp.logros.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LogrosService {

    private final LogroRepository logroRepository;
    private final LogroUsuarioRepository logroUsuarioRepository;

    public List<LogroUsuario> logrosDeUsuario(Long usuarioId) {
        return logroUsuarioRepository.findByUsuarioId(usuarioId);
    }

    public void evaluarLogros(Long usuarioId) {
        // TODO: evaluar condiciones segun evento recibido del bus (SerieConfirmada)
        // TODO: si se cumple condicion -> crear LogroUsuario y emitir LogroDesbloqueado
        throw new UnsupportedOperationException("Implementar motor de evaluacion de logros");
    }

    public List<Logro> rankingSocial() {
        // TODO: calcular ranking por rachas/sesiones entre usuarios de misma sede
        throw new UnsupportedOperationException("Implementar ranking social");
    }
}
