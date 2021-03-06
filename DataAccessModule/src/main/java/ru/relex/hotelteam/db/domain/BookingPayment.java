package ru.relex.hotelteam.db.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created by Tarasov Ivan on 20/07/2019 Time: 19:01
 */
public class BookingPayment {

  private int id;
  private int userId;
  private int bookingId;
  private int roomId;
  private boolean paid;
  private int amountOfDays;
  private LocalDateTime date;
  private BigDecimal total;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getRoomId() {
    return roomId;
  }

  public void setRoomId(int roomId) {
    this.roomId = roomId;
  }

  public boolean isPaid() {
    return paid;
  }

  public void setPaid(boolean paid) {
    this.paid = paid;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public int getBookingId() {
    return bookingId;
  }

  public void setBookingId(int bookingId) {
    this.bookingId = bookingId;
  }

  public int getAmountOfDays() {
    return amountOfDays;
  }

  public void setAmountOfDays(int amountOfDays) {
    this.amountOfDays = amountOfDays;
  }

  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }
}
