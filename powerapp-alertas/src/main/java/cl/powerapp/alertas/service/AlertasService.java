package cl.powerapp.alertas.service;

import cl.powerapp.alertas.model.*;
import cl.powerapp.alertas.repository.AlertaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AlertasService {

    private final AlertaRepository alertaRepository;

    public List<Alerta> alertasDeUsuario(Long usuarioId) {
        return alertaRepository.findByUsuarioIdOrderByCreadoEnDesc(usuarioId);
    }

    public void enviarNotificacion(Long usuarioId, TipoAlerta tipo, String titulo, String contenido) {
        // TODO: guardar Alerta en BD
        // TODO: enviar push via Firebase Cloud Messaging (FCM)
        throw new UnsupportedOperationException("Implementar envio FCM y persistencia");
    }

    public void marcarLeidas(Long usuarioId) {
        // TODO: marcar todas las alertas del usuario como leidas
        throw new UnsupportedOperationException("Implementar marcar como leidas");
    }
}
