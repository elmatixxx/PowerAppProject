package cl.powerapp.alertas.exception;

public class AlertaNoEncontradaException extends RuntimeException {

    public AlertaNoEncontradaException(Long id) {
        super("Alerta no encontrada con id: " + id);
    }

    public AlertaNoEncontradaException(String mensaje) {
        super(mensaje);
    }
}
