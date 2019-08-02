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
import ru.relex.hotelteam.dto.category.CategoryFullDto;
import ru.relex.hotelteam.services.ICategoryService;

// import ru.relex.hotelteam.service.dto.UserUpdateDto; а что по апдейтам типа, категории и удобств?

@RestController
@RequestMapping(path = "/categories",
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CategoryController {

  private final ICategoryService categoryService;

  public CategoryController(final ICategoryService categoryService) {
    this.categoryService = categoryService;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public CategoryFullDto createCategory(@RequestBody CategoryFullDto dto) {
    return categoryService.save(dto);
  }

  @GetMapping
  public List<CategoryFullDto> listCategories() {
    return categoryService.getAll();
  }

  @GetMapping("/{id}")
  public CategoryFullDto findById(@PathVariable("id") int id) {
    return categoryService.getById(id);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void removeCategory(@PathVariable("id") int id) {
    categoryService.delete(id);
  }
}
