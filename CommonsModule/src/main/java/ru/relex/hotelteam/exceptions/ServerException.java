package ru.relex.hotelteam.exceptions;

/**
 * Representation of any server exceptions.
 *
 * @author Tarasov Ivan
 */
public class ServerException extends RuntimeException {

  public ServerException(String entity) {
    super(String.format("%s", entity));
  }

  public ServerException(String entity, int id) {
    super(String.format("%s with id '%d' not found", entity, id));
  }

}
