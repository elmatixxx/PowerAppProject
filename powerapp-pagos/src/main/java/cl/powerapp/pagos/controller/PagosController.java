package cl.powerapp.pagos.controller;

import cl.powerapp.pagos.dto.*;
import cl.powerapp.pagos.model.Pago;
import cl.powerapp.pagos.service.PagosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pagos")
@RequiredArgsConstructor
public class PagosController {

    private final PagosService pagosService;

    // POST /api/v1/pagos
    @PostMapping
    public ResponseEntity<PagoResponseDTO> procesar(@Valid @RequestBody PagoRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(pagosService.procesarPago(dto));
    }

    // GET /api/v1/pagos/pendientes
    @GetMapping("/pendientes")
    public ResponseEntity<List<Pago>> pendientes() {
        return ResponseEntity.ok(pagosService.pagosPendientes());
    }

    // GET /api/v1/pagos/historial/{usuarioId}
    @GetMapping("/historial/{usuarioId}")
    public ResponseEntity<List<Pago>> historial(@PathVariable Long usuarioId) {
        return ResponseEntity.ok(pagosService.historialUsuario(usuarioId));
    }

    // PUT /api/v1/pagos/{id}/confirmar
    @PutMapping("/{id}/confirmar")
    public ResponseEntity<Pago> confirmar(@PathVariable Long id) {
        return ResponseEntity.ok(pagosService.marcarComoPagado(id));
    }

    // PUT /api/v1/pagos/{id}/suspender
    @PutMapping("/{id}/suspender")
    public ResponseEntity<Pago> suspender(@PathVariable Long id) {
        return ResponseEntity.ok(pagosService.suspender(id));
    }
}
