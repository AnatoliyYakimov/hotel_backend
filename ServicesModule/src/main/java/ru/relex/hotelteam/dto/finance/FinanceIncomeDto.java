package ru.relex.hotelteam.dto.finance;

import java.math.BigDecimal;
import java.util.List;
import ru.relex.hotelteam.dto.bookings.BookingPaymentDto;

/**
 * Main representation of finance statistics for income info.
 * Consists a list of payments and whole income for interval.
 *
 * @author Tarasov Ivan
 */
public class FinanceIncomeDto {

  private List<BookingPaymentDto> payments;
  private BigDecimal income;

  public List<BookingPaymentDto> getPayments() {
    return payments;
  }

  public void setPayments(List<BookingPaymentDto> payments) {
    this.payments = payments;
  }

  public BigDecimal getIncome() {
    return income;
  }

  public void setIncome(BigDecimal income) {
    this.income = income;
  }
}
