package ru.relex.hotelteam.mapstruct;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.relex.hotelteam.db.domain.Type;
import ru.relex.hotelteam.dto.type.TypeDto;
import ru.relex.hotelteam.dto.type.TypeFullDto;

@Mapper(componentModel = "spring")
public interface ITypeMapstruct {

  Type fromDto(TypeFullDto dto); // почему тут dto? непонятно. неясно.

  @Mapping(target = "price", ignore = true)
  Type fromDto(TypeDto dto);

  List<Type> fromDto(List<TypeDto> typeList); //зачем лист тоже неясно

  TypeFullDto toDto(Type type);

  List<TypeDto> toDto(List<Type> typeList);
}
