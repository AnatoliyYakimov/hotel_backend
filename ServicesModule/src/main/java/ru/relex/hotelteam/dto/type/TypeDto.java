package ru.relex.hotelteam.dto.type;

public class TypeDto {

  private int id;
  private boolean twinBed;
  private int places;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean getTwinBed() {
    return twinBed;
  }

  public void setTwinBed(boolean twinBed) {
    this.twinBed = twinBed;
  }

  public int getPlaces() {
    return places;
  }

  public void setPlaces(int places) {
    this.places = places;
  }

}
