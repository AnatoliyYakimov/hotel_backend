package ru.relex.hotelteam.dto.bookings;

import java.time.LocalDateTime;

/**
 * Created by Tarasov Ivan on 21/07/2019 Time: 20:28.
 */
public class BookingRegisterDto {

  // ненадобностью удалить
  private int userId;

  private int bookingId;
  private LocalDateTime checkInDate;

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getBookingId() {
    return bookingId;
  }

  public void setBookingId(int bookingId) {
    this.bookingId = bookingId;
  }

  public LocalDateTime getCheckInDate() {
    return checkInDate;
  }

  public void setCheckInDate(LocalDateTime checkInDate) {
    this.checkInDate = checkInDate;
  }
}
