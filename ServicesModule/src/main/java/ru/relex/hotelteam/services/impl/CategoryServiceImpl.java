package ru.relex.hotelteam.services.impl;/*
 *
 *
 * Author: Anatoliy Yakimov
 * Created at: 02.08.2019
 */

import java.util.List;
import org.springframework.stereotype.Service;
import ru.relex.hotelteam.db.domain.Category;
import ru.relex.hotelteam.db.mapper.ICategoryMapper;
import ru.relex.hotelteam.dto.category.CategoryFullDto;
import ru.relex.hotelteam.exceptions.EntityNotFoundException;
import ru.relex.hotelteam.mapstruct.ICategoryMapstruct;
import ru.relex.hotelteam.services.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService {

  private ICategoryMapstruct mapstruct;

  private ICategoryMapper mapper;

  public CategoryServiceImpl(ICategoryMapstruct mapstruct, ICategoryMapper mapper) {
    this.mapstruct = mapstruct;
    this.mapper = mapper;
  }

  @Override
  public CategoryFullDto getById(int id) {
    return mapper.getById(id).map(mapstruct::toFullDto).orElseThrow(() -> new EntityNotFoundException("Not found"));
  }

  @Override
  public List<CategoryFullDto> getAll() {
    return mapstruct.toFullDto(mapper.getAll());
  }

  @Override
  public CategoryFullDto save(CategoryFullDto type) {
    Category saved = mapper.save(mapstruct.fromDto(type));
    return mapstruct.toFullDto(saved);
  }

  @Override
  public void update(int id, CategoryFullDto type) {
    mapper.update(id, mapstruct.fromDto(type));
  }

  @Override
  public void delete(int id) {
    mapper.delete(id);
  }
}
