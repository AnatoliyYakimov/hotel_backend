package ru.relex.hotelteam.web.advices;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.relex.hotelteam.exceptions.EmployeeException;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class EmployeeExceptionHandler extends ResponseEntityExceptionHandler{

  @ExceptionHandler(EmployeeException.class)
  protected ResponseEntity<Object> handleException(RuntimeException ex) {
    return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
  }
}
