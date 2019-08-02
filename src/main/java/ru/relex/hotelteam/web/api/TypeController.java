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
import ru.relex.hotelteam.dto.type.TypeDto;
import ru.relex.hotelteam.dto.type.TypeFullDto;
import ru.relex.hotelteam.services.ITypeService;

@RestController
@RequestMapping(path = "/types",
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)

public class TypeController {

  public TypeController(ITypeService service) {
    this.service = service;
  }

  private final ITypeService service;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public TypeFullDto createType(@RequestBody TypeFullDto dto) {
    return service.save(dto);
  }

  @GetMapping
  public List<TypeDto> listTypes() {
    return service.getAll();
  }

  @GetMapping("/{id}")
  public TypeFullDto findById(@PathVariable("id") int id) {
    return service.getById(id);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void removeType(@PathVariable("id") int id) {
    service.delete(id);
  }

}
