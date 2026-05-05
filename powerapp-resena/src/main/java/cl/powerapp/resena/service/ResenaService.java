package cl.powerapp.resena.service;

import cl.powerapp.resena.dto.ResenaRequestDTO;
import cl.powerapp.resena.model.Resena;
import cl.powerapp.resena.repository.ResenaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ResenaService {

    private final ResenaRepository resenaRepository;

    public Resena crear(ResenaRequestDTO dto) {
        // TODO: mapear DTO y persistir
        throw new UnsupportedOperationException("Implementar creacion de resena");
    }

    public List<Resena> porEjercicio(Long ejercicioId) {
        return resenaRepository.findByEjercicioId(ejercicioId);
    }

    public Double promedio(Long ejercicioId) {
        return resenaRepository.promedioCalificacion(ejercicioId);
    }
}
