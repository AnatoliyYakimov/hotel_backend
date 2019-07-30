package ru.relex.hotelteam.dto.finance;

import java.math.BigDecimal;
import java.util.List;
import ru.relex.hotelteam.dto.bookings.BookingPaymentDto;

/**
 * For representation of finance statistics for income info.
 *
 * @author Tarasov Ivan
 */
public class FinanceIncomeDto {

  private BookingPaymentDto payment;
  private BigDecimal income;

  public BookingPaymentDto getPayment() {
    return payment;
  }

  public void setPayment(BookingPaymentDto payment) {
    this.payment = payment;
  }

  public BigDecimal getIncome() {
    return income;
  }

  public void setIncome(BigDecimal income) {
    this.income = income;
  }
}
