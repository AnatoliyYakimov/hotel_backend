package ru.relex.hotelteam.services.impl;/*
 *
 *
 * Author: Anatoliy Yakimov
 * Created at: 02.08.2019
 */

import java.util.List;
import org.springframework.stereotype.Service;
import ru.relex.hotelteam.db.domain.Type;
import ru.relex.hotelteam.db.mapper.ITypeMapper;
import ru.relex.hotelteam.dto.type.TypeDto;
import ru.relex.hotelteam.dto.type.TypeFullDto;
import ru.relex.hotelteam.exceptions.EntityNotFoundException;
import ru.relex.hotelteam.mapstruct.ITypeMapstruct;
import ru.relex.hotelteam.services.ITypeService;

@Service
public class TypeServiceImpl implements ITypeService {

  private ITypeMapstruct mapstruct;

  private ITypeMapper mapper;

  public TypeServiceImpl(ITypeMapstruct mapstruct, ITypeMapper mapper) {
    this.mapstruct = mapstruct;
    this.mapper = mapper;
  }

  @Override
  public TypeFullDto getById(int id) {
    return mapper.getById(id).map(mapstruct::toDto).orElseThrow(() -> new EntityNotFoundException("Not found"));
  }

  @Override
  public List<TypeDto> getAll() {
    return mapstruct.toDto(mapper.getAll());
  }

  @Override
  public TypeFullDto save(TypeFullDto type) {
    Type saved = mapper.save(mapstruct.fromDto(type));
    return mapstruct.toDto(saved);
  }

  @Override
  public void update(int id, TypeFullDto type) {
    mapper.update(id, mapstruct.fromDto(type));
  }

  @Override
  public void delete(int id) {
    mapper.delete(id);
  }
}
