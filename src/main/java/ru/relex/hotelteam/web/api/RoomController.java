package ru.relex.hotelteam.web.api;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.annotation.security.RolesAllowed;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.relex.hotelteam.dto.RoomBaseDto;
import ru.relex.hotelteam.dto.RoomWithIdDto;
import ru.relex.hotelteam.dto.date.IntervalDto;
import ru.relex.hotelteam.services.IRoomService;

@RestController
@RequestMapping(path = "/rooms", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class RoomController {

  private IRoomService service;

  public RoomController(IRoomService service) {
    this.service = service;
  }

  @GetMapping("/{id}")
  public RoomBaseDto getRoomById(@PathVariable int id) {
    return service.getRoomById(id);
  }

  @GetMapping
  public List<RoomWithIdDto> getAllRooms() {
    return service.getAllRooms();
  }

  @GetMapping("/vacancies")
  public List<RoomWithIdDto> getVacancies(@RequestParam("checkIn") String checkIn,
      @RequestParam("checkOut") String checkOut)
      throws ParseException {
    IntervalDto interval = new IntervalDto();
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

    interval.setFrom(format.parse(checkIn));
    interval.setTo(format.parse(checkOut));
    return service.getVacancies(interval);
  }

  @RolesAllowed({"ROLE_OWNER"})
  @PostMapping
  public RoomBaseDto saveRoom(@RequestBody RoomBaseDto room) throws SQLException {
    return service.saveRoom(room);
  }

  @RolesAllowed({"ROLE_OWNER"})
  @PutMapping("/{id}")
  public RoomBaseDto updateRoom(@PathVariable("id") int id, @RequestBody RoomBaseDto room) {
    return service.updateRoom(id, room);
  }

  /*
    Чтобы "защитить" метод от постороннеого доступа следует добавить аннотацию @RolesAllowed()
    и перечислить в ней те роли, которые могут получать доступ к метода контроллера
    Для всех остальных ролей в качестве ответа будет передана ошибка 403 Access denied
   */
  @RolesAllowed("ROLE_OWNER")
  @DeleteMapping("/{id}")
  public void deleteRoom(@PathVariable("id") int id) {
    service.deleteRoom(id);
  }
}
