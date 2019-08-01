package ru.relex.hotelteam.exceptions;

/**
 * Created by Tarasov Ivan on 22/07/2019.
 */
public class RegisterGuestException extends ServerException {

  public RegisterGuestException(String entity) {
    super(entity);
  }

  public RegisterGuestException(String entity, int id) {
    super(entity, id);
  }
}
