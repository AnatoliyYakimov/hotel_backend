package ru.relex.hotelteam.db.mapper;

import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ru.relex.hotelteam.db.domain.Facility;

@Mapper
public interface IFacilityMapper {

  Facility createFacility(Facility facility);

  Optional<Facility> getFacilityById(int id);

  List<Facility> listFacilities();

  void deleteFacility(@Param("id") int id);

  void updateFacility(@Param("id") int id, @Param("Updated") Facility facility);
}
