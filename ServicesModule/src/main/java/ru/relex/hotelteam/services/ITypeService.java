package ru.relex.hotelteam.services;
/*
 *
 *
 * Author: Anatoliy Yakimov
 * Created at: 02.08.2019
 */

import java.util.List;
import ru.relex.hotelteam.dto.type.TypeDto;
import ru.relex.hotelteam.dto.type.TypeFullDto;

public interface ITypeService {

  TypeFullDto getById(int id);

  List<TypeDto> getAll();

  TypeFullDto save(TypeFullDto type);

  void update(int id, TypeFullDto type);

  void delete(int id);
}
