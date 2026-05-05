package cl.powerapp.catalogo.controller;

import cl.powerapp.catalogo.dto.SerieRequestDTO;
import cl.powerapp.catalogo.model.Serie;
import cl.powerapp.catalogo.service.CatalogoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/series")
@RequiredArgsConstructor
public class SerieController {

    private final CatalogoService catalogoService;

    // POST /api/v1/series
    @PostMapping
    public ResponseEntity<Serie> registrar(@Valid @RequestBody SerieRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(catalogoService.registrarSerie(dto));
    }

    // GET /api/v1/series/historial?usuarioId=1&ejercicioId=2
    @GetMapping("/historial")
    public ResponseEntity<List<Serie>> historial(
            @RequestParam Long usuarioId,
            @RequestParam Long ejercicioId) {
        return ResponseEntity.ok(catalogoService.historialUsuario(usuarioId, ejercicioId));
    }
}
