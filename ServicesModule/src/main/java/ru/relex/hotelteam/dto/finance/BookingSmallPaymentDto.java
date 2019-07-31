package ru.relex.hotelteam.dto.finance;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Tarasov Ivan.
 */
public class BookingSmallPaymentDto {

  private Date date;
  private BigDecimal total;

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }
}
