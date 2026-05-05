package cl.powerapp.alertas.service;

import cl.powerapp.alertas.dto.AlertaRequestDTO;
import cl.powerapp.alertas.dto.AlertaResponseDTO;
import cl.powerapp.alertas.exception.AlertaNoEncontradaException;
import cl.powerapp.alertas.model.Alerta;
import cl.powerapp.alertas.repository.AlertaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlertaService {

    private final AlertaRepository alertaRepository;

    public List<AlertaResponseDTO> listarPorUsuario(Long usuarioId) {
        List<Alerta> alertas = alertaRepository.findByUsuarioIdOrderByCreadoEnDesc(usuarioId);
        return alertas.stream()
                .map(this::convertirADTO)
                .toList();
    }

    public List<AlertaResponseDTO> listarNoLeidas(Long usuarioId) {
        List<Alerta> alertas = alertaRepository.findByUsuarioIdAndLeidaFalse(usuarioId);
        return alertas.stream()
                .map(this::convertirADTO)
                .toList();
    }

    public AlertaResponseDTO crear(AlertaRequestDTO dto) {
        Alerta alerta = Alerta.builder()
                .usuarioId(dto.getUsuarioId())
                .titulo(dto.getTitulo())
                .contenido(dto.getContenido())
                .tipo(dto.getTipo())
                .leida(false)
                .build();

        Alerta guardada = alertaRepository.save(alerta);
        return convertirADTO(guardada);
    }

    public AlertaResponseDTO marcarComoLeida(Long id) {
        Alerta alerta = alertaRepository.findById(id)
                .orElseThrow(() -> new AlertaNoEncontradaException(id));

        alerta.setLeida(true);
        Alerta actualizada = alertaRepository.save(alerta);
        return convertirADTO(actualizada);
    }

    public void marcarTodasLeidas(Long usuarioId) {
        List<Alerta> alertas = alertaRepository.findByUsuarioIdAndLeidaFalse(usuarioId);
        alertas.forEach(a -> a.setLeida(true));
        alertaRepository.saveAll(alertas);
    }

    public void eliminar(Long id) {
        Alerta alerta = alertaRepository.findById(id)
                .orElseThrow(() -> new AlertaNoEncontradaException(id));
        alertaRepository.delete(alerta);
    }

    private AlertaResponseDTO convertirADTO(Alerta alerta) {
        return AlertaResponseDTO.builder()
                .id(alerta.getId())
                .usuarioId(alerta.getUsuarioId())
                .titulo(alerta.getTitulo())
                .contenido(alerta.getContenido())
                .tipo(alerta.getTipo())
                .leida(alerta.getLeida())
                .creadoEn(alerta.getCreadoEn())
                .build();
    }
}
