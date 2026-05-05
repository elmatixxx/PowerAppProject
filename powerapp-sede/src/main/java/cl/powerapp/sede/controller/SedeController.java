package cl.powerapp.sede.controller;

import cl.powerapp.sede.dto.SedeDTO;
import cl.powerapp.sede.model.Sede;
import cl.powerapp.sede.service.SedeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/sedes")
@RequiredArgsConstructor
public class SedeController {

    private final SedeService sedeService;

    // GET /api/v1/sedes
    @GetMapping
    public ResponseEntity<List<Sede>> listar() {
        return ResponseEntity.ok(sedeService.listar());
    }

    // POST /api/v1/sedes
    @PostMapping
    public ResponseEntity<Sede> crear(@Valid @RequestBody SedeDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(sedeService.crear(dto));
    }

    // PUT /api/v1/sedes/{id}/entrada
    @PutMapping("/{id}/entrada")
    public ResponseEntity<Sede> entrada(@PathVariable Long id) {
        return ResponseEntity.ok(sedeService.registrarEntrada(id));
    }

    // PUT /api/v1/sedes/{id}/salida
    @PutMapping("/{id}/salida")
    public ResponseEntity<Sede> salida(@PathVariable Long id) {
        return ResponseEntity.ok(sedeService.registrarSalida(id));
    }
}
