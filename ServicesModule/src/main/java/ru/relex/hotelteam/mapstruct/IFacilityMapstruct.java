package ru.relex.hotelteam.mapstruct;


import java.util.List;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;
import ru.relex.hotelteam.db.domain.Facility;
import ru.relex.hotelteam.dto.facility.FacilityDto;
import ru.relex.hotelteam.dto.facility.FacilityFullDto;

@Mapper(componentModel = "spring")
public interface IFacilityMapstruct {

  @Mapping(target = "price", ignore = true)
  Facility fromDto(FacilityDto dto);

  Facility fromDto(FacilityFullDto dto);

  @IterableMapping(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
  List<Facility> fromDto(List<FacilityFullDto> facilityList);

  FacilityDto toDto(Facility facility);

  @IterableMapping(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
  List<FacilityDto> toDto(List<Facility> facilityDtoList);

  @IterableMapping(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
  List<FacilityFullDto> toFullDto(List<Facility> facilityDtoList);

  FacilityFullDto toFullDto(Facility domain);
}
