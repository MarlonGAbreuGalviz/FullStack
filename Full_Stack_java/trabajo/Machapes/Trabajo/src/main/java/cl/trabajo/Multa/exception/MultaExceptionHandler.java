package cl.trabajo.Multa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MultaExceptionHandler {
     @ExceptionHandler(MultaException.class)
    public ResponseEntity<String> handleMultaException(MultaException ex) {
        // Responde con código 404 NOT FOUND y el mensaje de la excepción
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    // Opcional: captura otras excepciones genéricas y responde con error 500
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneralException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body("Error interno del servidor: " + ex.getMessage());
    }



    
}
