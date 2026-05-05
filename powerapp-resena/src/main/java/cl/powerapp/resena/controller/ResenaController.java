package cl.powerapp.resena.controller;

import cl.powerapp.resena.dto.ResenaRequestDTO;
import cl.powerapp.resena.model.Resena;
import cl.powerapp.resena.service.ResenaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/resenas")
@RequiredArgsConstructor
public class ResenaController {

    private final ResenaService resenaService;

    // POST /api/v1/resenas
    @PostMapping
    public ResponseEntity<Resena> crear(@Valid @RequestBody ResenaRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(resenaService.crear(dto));
    }

    // GET /api/v1/resenas/ejercicio/{id}
    @GetMapping("/ejercicio/{id}")
    public ResponseEntity<List<Resena>> porEjercicio(@PathVariable Long id) {
        return ResponseEntity.ok(resenaService.porEjercicio(id));
    }

    // GET /api/v1/resenas/ejercicio/{id}/promedio
    @GetMapping("/ejercicio/{id}/promedio")
    public ResponseEntity<Double> promedio(@PathVariable Long id) {
        return ResponseEntity.ok(resenaService.promedio(id));
    }
}
