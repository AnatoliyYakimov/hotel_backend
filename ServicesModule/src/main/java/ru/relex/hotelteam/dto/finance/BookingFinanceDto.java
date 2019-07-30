package ru.relex.hotelteam.dto.finance;

import java.math.BigDecimal;
import ru.relex.hotelteam.dto.bookings.BookingPaymentDto;

/**
 * Created by Tarasov Ivan.
 */
public class BookingFinanceDto {

  private BookingPaymentDto payment;
  private BigDecimal total;

  public BookingPaymentDto getPayment() {
    return payment;
  }

  public void setPayment(BookingPaymentDto payment) {
    this.payment = payment;
  }

  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }
}
