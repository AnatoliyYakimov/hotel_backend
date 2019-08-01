package ru.relex.hotelteam.dto.finance;

import java.math.BigDecimal;
import java.util.List;

/**
 * Main representation of finance statistics for income info.
 * Consists a list of payments and whole income for interval.
 *
 * @author Tarasov Ivan
 */
public class FinanceIncomeDto {

  private List<BookingSmallPaymentDto> payments;
  private BigDecimal income;

  public List<BookingSmallPaymentDto> getPayments() {
    return payments;
  }

  public void setPayments(List<BookingSmallPaymentDto> payments) {
    this.payments = payments;
  }

  public BigDecimal getIncome() {
    return income;
  }

  public void setIncome(BigDecimal income) {
    this.income = income;
  }
}
