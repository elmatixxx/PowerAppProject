package cl.powerapp.alertas.controller;

import cl.powerapp.alertas.model.Alerta;
import cl.powerapp.alertas.service.AlertasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/alertas")
@RequiredArgsConstructor
public class AlertasController {

    private final AlertasService alertasService;

    // GET /api/v1/alertas/{usuarioId}
    @GetMapping("/{usuarioId}")
    public ResponseEntity<List<Alerta>> listar(@PathVariable Long usuarioId) {
        return ResponseEntity.ok(alertasService.alertasDeUsuario(usuarioId));
    }

    // PUT /api/v1/alertas/{usuarioId}/leer
    @PutMapping("/{usuarioId}/leer")
    public ResponseEntity<Void> marcarLeidas(@PathVariable Long usuarioId) {
        alertasService.marcarLeidas(usuarioId);
        return ResponseEntity.ok().build();
    }
}
