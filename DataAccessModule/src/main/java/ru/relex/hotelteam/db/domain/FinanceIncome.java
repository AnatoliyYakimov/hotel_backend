package ru.relex.hotelteam.db.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * For representation of finance statistics for income info.
 *
 * @author Tarasov Ivan
 */
public class FinanceIncome {

  private List<BookingPayment> paymentList;
  private BigDecimal income;

  public List<BookingPayment> getPaymentList() {
    return paymentList;
  }

  public void setPaymentList(List<BookingPayment> paymentList) {
    this.paymentList = paymentList;
  }

  public BigDecimal getIncome() {
    return income;
  }

  public void setIncome(BigDecimal income) {
    this.income = income;
  }
}
