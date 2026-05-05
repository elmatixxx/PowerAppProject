package cl.powerapp.planes.service;

import cl.powerapp.planes.dto.*;
import cl.powerapp.planes.model.*;
import cl.powerapp.planes.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlanesService {

    private final PlanRepository planRepository;
    private final MembresiaRepository membresiaRepository;

    public List<Plan> listarPlanes() {
        return planRepository.findByActivoTrue();
    }

    public Membresia suscribir(MembresiaRequestDTO dto) {
        // TODO: crear membresia, calcular fechaFin segun plan.duracionDias
        // TODO: emitir evento MembresiaActivada al bus
        throw new UnsupportedOperationException("Implementar suscripcion a plan");
    }

    public Membresia membresiaActiva(Long usuarioId) {
        return membresiaRepository.findByUsuarioIdAndEstado(usuarioId, EstadoMembresia.ACTIVA)
            .orElseThrow(() -> new RuntimeException("Sin membresia activa para usuario: " + usuarioId));
    }

    public List<Membresia> pendientesPago() {
        return membresiaRepository.findByEstado(EstadoMembresia.PENDIENTE_PAGO);
    }
}
