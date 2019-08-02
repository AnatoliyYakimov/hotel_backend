package ru.relex.hotelteam.db.mapper;

import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ru.relex.hotelteam.db.domain.Type;

@Mapper
public interface ITypeMapper {

  Type save(@Param("type") Type type);

  Optional<Type> getById(@Param("id") int id);

  List<Type> getAll();

  void delete(@Param("id") int id);

  void update(@Param("id") int id, @Param("updated") Type type);
}
