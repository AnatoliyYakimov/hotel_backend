package ru.relex.hotelteam.dto;

import ru.relex.hotelteam.shared.model.Authority;

/**
 * Represents an employee (owner or admin).
 *
 * @author Tarasov Ivan
 */
public class UserEmployeeDto extends  UserDto {

  private Authority authority;

  public Authority getAuthority() {
    return authority;
  }
}
