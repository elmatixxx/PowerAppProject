package cl.powerapp.pagos.service;

import cl.powerapp.pagos.dto.*;
import cl.powerapp.pagos.model.*;
import cl.powerapp.pagos.repository.PagoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PagosService {

    private final PagoRepository pagoRepository;

    public PagoResponseDTO procesarPago(PagoRequestDTO dto) {
        // TODO: integrar con Transbank WebPay o Stripe via WebClient
        // TODO: guardar Pago con estado PENDIENTE, actualizar a APROBADO/RECHAZADO
        // TODO: notificar al MS Planes si pago APROBADO
        throw new UnsupportedOperationException("Implementar procesamiento con Transbank/Stripe");
    }

    public List<Pago> pagosPendientes() {
        return pagoRepository.findByEstado(EstadoPago.PENDIENTE);
    }

    public List<Pago> historialUsuario(Long usuarioId) {
        return pagoRepository.findByUsuarioId(usuarioId);
    }

    public Pago marcarComoPagado(Long pagoId) {
        // TODO: cambiar estado a APROBADO y emitir evento
        throw new UnsupportedOperationException("Implementar confirmacion manual de pago");
    }

    public Pago suspender(Long pagoId) {
        // TODO: cambiar estado a RECHAZADO y notificar a MS Planes para suspender membresia
        throw new UnsupportedOperationException("Implementar suspension de pago");
    }
}
