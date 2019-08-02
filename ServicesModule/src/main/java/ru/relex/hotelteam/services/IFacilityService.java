package ru.relex.hotelteam.services;

import java.util.List;
import ru.relex.hotelteam.dto.facility.FacilityFullDto;

public interface IFacilityService {

  FacilityFullDto createFacility(FacilityFullDto dto);

  FacilityFullDto findById(int id);

  List<FacilityFullDto> listFacilities();

  void delete(int id);

  void update(int id, FacilityFullDto updatedFacility);
}
