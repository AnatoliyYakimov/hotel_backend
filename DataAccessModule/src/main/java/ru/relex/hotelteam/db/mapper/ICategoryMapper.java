package ru.relex.hotelteam.db.mapper;

import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ru.relex.hotelteam.db.domain.Category;

@Mapper
public interface ICategoryMapper {

  Category save(@Param("category") Category category);

  Optional<Category> getById(@Param("id") int id);

  List<Category> getAll();

  void update(@Param("id") int id, @Param("updated") Category category);

  void delete(@Param("id") int id);
}
