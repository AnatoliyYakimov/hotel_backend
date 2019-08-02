package ru.relex.hotelteam.services.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import ru.relex.hotelteam.db.mapper.IFacilityMapper;
import ru.relex.hotelteam.dto.facility.FacilityFullDto;
import ru.relex.hotelteam.exceptions.EntityNotFoundException;
import ru.relex.hotelteam.mapstruct.IFacilityMapstruct;
import ru.relex.hotelteam.services.IFacilityService;

@Service
public class FacilityServiceImpl implements IFacilityService {

  private final IFacilityMapper mapper;
  private final IFacilityMapstruct mapstruct;

  public FacilityServiceImpl(IFacilityMapper mapper, IFacilityMapstruct mapstruct) {
    this.mapper = mapper;
    this.mapstruct = mapstruct;
  }

  @Override
  public FacilityFullDto createFacility(FacilityFullDto dto) {
    return mapstruct.toFullDto(mapper.createFacility(mapstruct.fromDto(dto)));
  }

  @Override
  public FacilityFullDto findById(int id) {
    return mapstruct.toFullDto(mapper.getFacilityById(id).orElseThrow(
        () -> new EntityNotFoundException("Facility not found")
    ));
  }

  @Override
  public List<FacilityFullDto> listFacilities() {
    return mapstruct.toFullDto(mapper.listFacilities());
  }

  @Override
  public void delete(int id) {
    mapper.deleteFacility(id);
  }

  @Override
  public void update(int id, FacilityFullDto updatedFacility) {
    mapper.updateFacility(id, mapstruct.fromDto(updatedFacility));
  }
}
