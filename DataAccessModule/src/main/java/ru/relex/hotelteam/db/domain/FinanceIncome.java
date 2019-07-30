package ru.relex.hotelteam.db.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * For representation of finance statistics for income info.
 *
 * @author Tarasov Ivan
 */
public class FinanceIncome {

  private BookingPayment paymentList;
  private BigDecimal income;

  public BookingPayment getPaymentList() {
    return paymentList;
  }

  public void setPaymentList(BookingPayment paymentList) {
    this.paymentList = paymentList;
  }

  public BigDecimal getIncome() {
    return income;
  }

  public void setIncome(BigDecimal income) {
    this.income = income;
  }
}
