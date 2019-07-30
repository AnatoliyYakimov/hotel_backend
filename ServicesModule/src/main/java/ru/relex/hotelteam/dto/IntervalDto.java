package ru.relex.hotelteam.dto;


import java.util.Date;

/**
 * For representation of date interval.
 *
 * @author Tarasov Ivan
 */
public class IntervalDto {

  private Date from;
  private Date to;

  public Date getFrom() {
    return from;
  }

  public void setFrom(Date from) {
    this.from = from;
  }

  public Date getTo() {
    return to;
  }

  public void setTo(Date to) {
    this.to = to;
  }
}
