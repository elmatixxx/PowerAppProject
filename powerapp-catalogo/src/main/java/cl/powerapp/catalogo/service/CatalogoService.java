package cl.powerapp.catalogo.service;

import cl.powerapp.catalogo.dto.*;
import cl.powerapp.catalogo.model.*;
import cl.powerapp.catalogo.repository.*;
import cl.powerapp.catalogo.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CatalogoService {

    private final EjercicioRepository ejercicioRepository;
    private final SerieRepository serieRepository;

    public List<Ejercicio> listarEjercicios() {
        return ejercicioRepository.findByActivoTrue();
    }

    public Ejercicio crearEjercicio(EjercicioDTO dto) {
        // TODO: mapear DTO a entidad y guardar
        throw new UnsupportedOperationException("Implementar creacion de ejercicio");
    }

    public Serie registrarSerie(SerieRequestDTO dto) {
        // TODO: calcular 1RM con formula Epley: peso * (1 + reps/30)
        // TODO: emitir evento SerieConfirmada al bus de eventos
        throw new UnsupportedOperationException("Implementar registro de serie con calculo 1RM");
    }

    public List<Serie> historialUsuario(Long usuarioId, Long ejercicioId) {
        return serieRepository.findByUsuarioIdAndEjercicioIdOrderByRegistradoEnDesc(usuarioId, ejercicioId);
    }
}
