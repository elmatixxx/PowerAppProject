package cl.powerapp.planes.controller;

import cl.powerapp.planes.dto.*;
import cl.powerapp.planes.model.*;
import cl.powerapp.planes.service.PlanesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/planes")
@RequiredArgsConstructor
public class PlanesController {

    private final PlanesService planesService;

    // GET /api/v1/planes
    @GetMapping
    public ResponseEntity<List<Plan>> listar() {
        return ResponseEntity.ok(planesService.listarPlanes());
    }

    // POST /api/v1/planes/suscribir
    @PostMapping("/suscribir")
    public ResponseEntity<Membresia> suscribir(@Valid @RequestBody MembresiaRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(planesService.suscribir(dto));
    }

    // GET /api/v1/planes/membresia/{usuarioId}
    @GetMapping("/membresia/{usuarioId}")
    public ResponseEntity<Membresia> membresiaActiva(@PathVariable Long usuarioId) {
        return ResponseEntity.ok(planesService.membresiaActiva(usuarioId));
    }

    // GET /api/v1/planes/pendientes
    @GetMapping("/pendientes")
    public ResponseEntity<List<Membresia>> pendientesPago() {
        return ResponseEntity.ok(planesService.pendientesPago());
    }

    // PUT /api/v1/planes/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Plan> actualizar(@PathVariable Long id, @Valid @RequestBody PlanDTO dto) {
        throw new UnsupportedOperationException("Implementar actualizacion de plan");
    }
}
