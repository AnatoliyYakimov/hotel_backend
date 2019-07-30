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

  private List<BookingPaymentDto> paymentList;
  private BigDecimal income;

  public List<BookingPaymentDto> getPaymentList() {
    return paymentList;
  }

  public void setPaymentList(List<BookingPaymentDto> paymentList) {
    this.paymentList = paymentList;
  }

  public BigDecimal getIncome() {
    return income;
  }

  public void setIncome(BigDecimal income) {
    this.income = income;
  }
}
