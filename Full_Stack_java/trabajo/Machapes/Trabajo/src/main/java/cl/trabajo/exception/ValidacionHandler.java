package cl.trabajo.exception;

import java.util.HashMap;
import java.util.Map;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class ValidacionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> manejarErroresValidacion(MethodArgumentNotValidException ex) { // Método para manejar excepciones de validación de argumentos en los controladores
        Map<String, String> errores = new HashMap<>(); // Mapa para almacenar los errores de validación: clave = campo con error, valor = mensaje descriptivo

        ex.getBindingResult().getFieldErrors().forEach(error ->// Iterar sobre los errores de validación
            // Por cada error de validación, agregamos al mapa el campo y su mensaje correspondiente
            errores.put(error.getField(), error.getDefaultMessage())
        );

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("errors", errores));// Retornamos una respuesta HTTP 400 con el detalle de errores en el cuerpo
    }
    
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<?> idNoEncontrado(NotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                             .body(Map.of("error", ex.getMessage()));
    }
    
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<?> handleEmptyBody(HttpMessageNotReadableException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                             .body(Map.of("error", "El cuerpo de la petición no puede estar vacío o es inválido"));
    }

}
