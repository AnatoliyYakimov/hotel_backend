package ru.relex.hotelteam.web.api;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.relex.hotelteam.dto.facility.FacilityFullDto;
import ru.relex.hotelteam.services.IFacilityService;
// import ru.relex.hotelteam.service.dto.UserUpdateDto; а что по апдейтам типа, категории и удобств?

@RestController
@RequestMapping(path = "/facilities",
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class FacilityController {

  private final IFacilityService facilityService;

  public FacilityController(final IFacilityService facilityService) {
    this.facilityService = facilityService;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public FacilityFullDto createFacility(@RequestBody FacilityFullDto dto) {
    return facilityService.createFacility(dto);
  }

  @GetMapping
  public List<FacilityFullDto> listFacilities() {
    return facilityService.listFacilities();
  }

  @GetMapping("/{id}")
  public FacilityFullDto findById(@PathVariable("id") int id) {
    return facilityService.findById(id);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void removeFacility(@PathVariable("id") int id) {
    facilityService.delete(id);
  }
}
