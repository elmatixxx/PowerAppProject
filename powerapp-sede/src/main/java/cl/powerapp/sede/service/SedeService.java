package cl.powerapp.sede.service;

import cl.powerapp.sede.dto.SedeDTO;
import cl.powerapp.sede.model.Sede;
import cl.powerapp.sede.repository.SedeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SedeService {

    private final SedeRepository sedeRepository;

    public List<Sede> listar() { return sedeRepository.findByActivoTrue(); }

    public Sede crear(SedeDTO dto) {
        throw new UnsupportedOperationException("Implementar creacion de sede");
    }

    public Sede registrarEntrada(Long sedeId) {
        // TODO: incrementar ocupacionActual y validar capacidad maxima
        throw new UnsupportedOperationException("Implementar registro de entrada");
    }

    public Sede registrarSalida(Long sedeId) {
        // TODO: decrementar ocupacionActual
        throw new UnsupportedOperationException("Implementar registro de salida");
    }
}
