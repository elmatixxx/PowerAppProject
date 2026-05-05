package cl.powerapp.soporte.controller;

import cl.powerapp.soporte.dto.TicketRequestDTO;
import cl.powerapp.soporte.model.TicketSoporte;
import cl.powerapp.soporte.service.SoporteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/soporte")
@RequiredArgsConstructor
public class SoporteController {

    private final SoporteService soporteService;

    // POST /api/v1/soporte
    @PostMapping
    public ResponseEntity<TicketSoporte> crear(@Valid @RequestBody TicketRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(soporteService.crearTicket(dto));
    }

    // GET /api/v1/soporte/usuario/{usuarioId}
    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<TicketSoporte>> porUsuario(@PathVariable Long usuarioId) {
        return ResponseEntity.ok(soporteService.ticketsDeUsuario(usuarioId));
    }

    // GET /api/v1/soporte/abiertos
    @GetMapping("/abiertos")
    public ResponseEntity<List<TicketSoporte>> abiertos() {
        return ResponseEntity.ok(soporteService.abiertos());
    }

    // PUT /api/v1/soporte/{id}/asignar/{trabajadorId}
    @PutMapping("/{id}/asignar/{trabajadorId}")
    public ResponseEntity<TicketSoporte> asignar(@PathVariable Long id, @PathVariable Long trabajadorId) {
        return ResponseEntity.ok(soporteService.asignar(id, trabajadorId));
    }

    // PUT /api/v1/soporte/{id}/cerrar
    @PutMapping("/{id}/cerrar")
    public ResponseEntity<TicketSoporte> cerrar(@PathVariable Long id) {
        return ResponseEntity.ok(soporteService.cerrar(id));
    }
}
