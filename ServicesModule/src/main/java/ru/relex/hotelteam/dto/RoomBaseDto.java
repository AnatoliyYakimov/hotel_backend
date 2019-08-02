package ru.relex.hotelteam.dto;

import java.math.BigDecimal;
import java.util.List;
import ru.relex.hotelteam.dto.category.CategoryDto;
import ru.relex.hotelteam.dto.facility.FacilityDto;
import ru.relex.hotelteam.dto.type.TypeDto;

/**
 * Author: Yakimov Date: 20.07.2019 Time: 21:04
 */
public class RoomBaseDto {

  private int number;
  private int floor;

  private TypeDto type;

  private CategoryDto category;

  private BigDecimal dailyPrice;

  private List<FacilityDto> facilities;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public int getFloor() {
    return floor;
  }

  public void setFloor(int floor) {
    this.floor = floor;
  }

  public List<FacilityDto> getFacilities() {
    return facilities;
  }

  public void setFacilities(List<FacilityDto> facilities) {
    this.facilities = facilities;
  }

  public TypeDto getType() {
    return type;
  }

  public void setType(TypeDto type) {
    this.type = type;
  }

  public CategoryDto getCategory() {
    return category;
  }

  public void setCategory(CategoryDto category) {
    this.category = category;
  }

  public BigDecimal getDailyPrice() {
    return dailyPrice;
  }

  public void setDailyPrice(BigDecimal dailyPrice) {
    this.dailyPrice = dailyPrice;
  }

}
