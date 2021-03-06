package ru.relex.hotelteam.web.api;

import java.util.List;
import javax.annotation.security.RolesAllowed;
import javax.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.relex.hotelteam.dto.UserAuthDto;
import ru.relex.hotelteam.dto.UserBaseDto;
import ru.relex.hotelteam.dto.UserDto;
import ru.relex.hotelteam.dto.UserEmployeeDto;
import ru.relex.hotelteam.dto.UserSecurityDto;
import ru.relex.hotelteam.dto.UserUpdateDto;
import ru.relex.hotelteam.dto.bookings.BookingFullDto;
import ru.relex.hotelteam.services.IUserService;

@RestController
@RequestMapping(path = "/users",
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {

  private final IUserService userService;

  public UserController(final IUserService userService) {
    this.userService = userService;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public UserBaseDto createUser(@RequestBody UserDto dto) {
    return userService.createUser(dto);
  }

  @RolesAllowed("ROLE_OWNER")
  @PostMapping("/employees")
  @ResponseStatus(HttpStatus.CREATED)
  public UserBaseDto createUserEmployee(@RequestBody UserEmployeeDto dto) {
    return userService.createEmployee(dto);
  }

  @RolesAllowed({"ROLE_OWNER","ROLE_ADMIN"})
  @GetMapping
  public List<UserBaseDto> listUsers() {
    return userService.listUsers();
  }

  @RolesAllowed({"ROLE_OWNER","ROLE_ADMIN"})
  @GetMapping("/{id}")
  public UserBaseDto findById(@PathVariable("id") int id) {
    return userService.findById(id);
  }

  @RolesAllowed("ROLE_OWNER")
  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void removeUser(@PathVariable("id") int id) {
    userService.delete(id);
  }

  @RolesAllowed("ROLE_OWNER")
  @PutMapping("/{id}")
  public void updateUser(@PathVariable("id") int id, @RequestBody UserUpdateDto dto) {
    userService.update(id, dto);
  }

  // валидация: id = число, dto.authority != null
  @PutMapping("/security/authority/{id}")
  public void updateUserAuthority(@PathVariable("id") int id, @RequestBody UserAuthDto dto) {
    userService.updateUserAuthority(id, dto.getAuthority());
  }

  @PutMapping("/security/{id}")
  public void updateUserSecurityInfo(@PathVariable("id") int id, @RequestBody UserSecurityDto dto) {
    userService.updateSecurityInfo(id, dto);
  }

  @RolesAllowed({"ROLE_OWNER","ROLE_ADMIN"})
  @GetMapping("/current-guests")
  public List<UserBaseDto> getCurrentGuests() {
    return userService.getCurrentGuests();
  }

  @RolesAllowed("ROLE_GUEST")
  @GetMapping("/{id}/booking-history")
  public List<BookingFullDto> getBookingHistory(@PathVariable("id") int id) {
    return userService.getBookingHistoryForUser(id);
  }

  // тут стоит rest api end-point обдумать для удобства
  @RolesAllowed({"ROLE_OWNER","ROLE_ADMIN"})
  @GetMapping("/booking-history")
  public List<BookingFullDto> getBookingHistoryForUser(@PathParam("userId") int id) {
    return userService.getBookingHistoryForUser(id);
  }
}
