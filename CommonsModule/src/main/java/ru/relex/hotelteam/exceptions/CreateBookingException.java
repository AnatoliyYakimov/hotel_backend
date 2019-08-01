package ru.relex.hotelteam.exceptions;

/**
 * Created by Tarasov Ivan on 22/07/2019.
 */
public class CreateBookingException extends ServerException {

  public CreateBookingException(String entity) {
    super(entity);
  }

  public CreateBookingException(String entity, int id) {
    super(entity, id);
  }
}
