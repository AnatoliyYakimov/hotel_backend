package ru.relex.hotelteam.services;/*
 *
 *
 * Author: Anatoliy Yakimov
 * Created at: 02.08.2019
 */

import java.util.List;
import ru.relex.hotelteam.dto.category.CategoryFullDto;

public interface ICategoryService {

  CategoryFullDto getById(int id);

  List<CategoryFullDto> getAll();

  void delete(int id);

  void update(int id, CategoryFullDto dto);

  CategoryFullDto save(CategoryFullDto dto);

}
