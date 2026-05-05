package cl.powerapp.logros.controller;

import cl.powerapp.logros.model.LogroUsuario;
import cl.powerapp.logros.service.LogrosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/logros")
@RequiredArgsConstructor
public class LogrosController {

    private final LogrosService logrosService;

    // GET /api/v1/logros/usuario/{usuarioId}
    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<LogroUsuario>> porUsuario(@PathVariable Long usuarioId) {
        return ResponseEntity.ok(logrosService.logrosDeUsuario(usuarioId));
    }

    // GET /api/v1/logros/ranking
    @GetMapping("/ranking")
    public ResponseEntity<?> ranking() {
        return ResponseEntity.ok(logrosService.rankingSocial());
    }

    // POST /api/v1/logros/evaluar/{usuarioId}
    @PostMapping("/evaluar/{usuarioId}")
    public ResponseEntity<Void> evaluar(@PathVariable Long usuarioId) {
        logrosService.evaluarLogros(usuarioId);
        return ResponseEntity.ok().build();
    }
}
