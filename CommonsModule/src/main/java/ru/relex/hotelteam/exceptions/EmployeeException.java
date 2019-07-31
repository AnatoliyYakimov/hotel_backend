package ru.relex.hotelteam.exceptions;

/**
 * Handling any exception with employee (owner, admin).
 *
 * @author Tarasov Ivan
 */
public class EmployeeException extends ServerException {

  public EmployeeException(String entity) {
    super(entity);
  }

  public EmployeeException(String entity, int id) {
    super(entity, id);
  }
}
