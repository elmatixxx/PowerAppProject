package cl.powerapp.catalogo.controller;

import cl.powerapp.catalogo.dto.EjercicioDTO;
import cl.powerapp.catalogo.model.Ejercicio;
import cl.powerapp.catalogo.service.CatalogoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/ejercicios")
@RequiredArgsConstructor
public class EjercicioController {

    private final CatalogoService catalogoService;

    // GET /api/v1/ejercicios
    @GetMapping
    public ResponseEntity<List<Ejercicio>> listar() {
        return ResponseEntity.ok(catalogoService.listarEjercicios());
    }

    // POST /api/v1/ejercicios
    @PostMapping
    public ResponseEntity<Ejercicio> crear(@Valid @RequestBody EjercicioDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(catalogoService.crearEjercicio(dto));
    }

    // GET /api/v1/ejercicios/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Ejercicio> buscarPorId(@PathVariable Long id) {
        // TODO: implementar buscar por ID
        throw new UnsupportedOperationException("Implementar busqueda por ID");
    }

    // PUT /api/v1/ejercicios/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Ejercicio> actualizar(@PathVariable Long id, @Valid @RequestBody EjercicioDTO dto) {
        // TODO: implementar actualizacion
        throw new UnsupportedOperationException("Implementar actualizacion");
    }

    // DELETE /api/v1/ejercicios/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        // TODO: soft delete (activo = false)
        throw new UnsupportedOperationException("Implementar eliminacion logica");
    }
}
