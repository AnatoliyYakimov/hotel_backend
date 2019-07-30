package ru.relex.hotelteam.db.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * For representation of finance statistics for income info.
 *
 * @author Tarasov Ivan
 */
public class FinanceIncome {

  private BookingPayment payment;
  private BigDecimal income;

  public BookingPayment getPayment() {
    return payment;
  }

  public void setPayment(BookingPayment payment) {
    this.payment = payment;
  }

  public BigDecimal getIncome() {
    return income;
  }

  public void setIncome(BigDecimal income) {
    this.income = income;
  }
}
