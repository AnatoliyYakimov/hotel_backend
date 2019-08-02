package ru.relex.hotelteam.mapstruct;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.relex.hotelteam.db.domain.Category;
import ru.relex.hotelteam.dto.category.CategoryDto;
import ru.relex.hotelteam.dto.category.CategoryFullDto;

@Mapper(componentModel = "spring")
public interface ICategoryMapstruct {

  Category fromDto(CategoryFullDto dto);

  @Mapping(target = "priceMultiplier", ignore = true)
  Category fromDto(CategoryDto dto);

  List<Category> fromDto(List<CategoryDto> categoryList);

  CategoryDto toDto(Category category);

  List<CategoryDto> toDto(List<Category> categoryList);

  CategoryFullDto toFullDto(Category domain);

  List<CategoryFullDto> toFullDto(List<Category> categoryList);
}
