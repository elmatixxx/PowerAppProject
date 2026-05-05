package cl.powerapp.alertas.controller;

import cl.powerapp.alertas.dto.AlertaRequestDTO;
import cl.powerapp.alertas.dto.AlertaResponseDTO;
import cl.powerapp.alertas.service.AlertaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/alertas")
@RequiredArgsConstructor
public class AlertaController {

    private final AlertaService alertaService;

    // GET /api/v1/alertas/usuario/{usuarioId}
    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<AlertaResponseDTO>> listarPorUsuario(@PathVariable Long usuarioId) {
        return ResponseEntity.ok(alertaService.listarPorUsuario(usuarioId));
    }

    // GET /api/v1/alertas/usuario/{usuarioId}/no-leidas
    @GetMapping("/usuario/{usuarioId}/no-leidas")
    public ResponseEntity<List<AlertaResponseDTO>> listarNoLeidas(@PathVariable Long usuarioId) {
        return ResponseEntity.ok(alertaService.listarNoLeidas(usuarioId));
    }

    // POST /api/v1/alertas
    @PostMapping
    public ResponseEntity<AlertaResponseDTO> crear(@Valid @RequestBody AlertaRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(alertaService.crear(dto));
    }

    // PUT /api/v1/alertas/{id}/leer
    @PutMapping("/{id}/leer")
    public ResponseEntity<AlertaResponseDTO> marcarComoLeida(@PathVariable Long id) {
        return ResponseEntity.ok(alertaService.marcarComoLeida(id));
    }

    // PUT /api/v1/alertas/usuario/{usuarioId}/leer-todas
    @PutMapping("/usuario/{usuarioId}/leer-todas")
    public ResponseEntity<Void> marcarTodasLeidas(@PathVariable Long usuarioId) {
        alertaService.marcarTodasLeidas(usuarioId);
        return ResponseEntity.ok().build();
    }

    // DELETE /api/v1/alertas/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        alertaService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
