package ru.relex.hotelteam.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import ru.relex.hotelteam.IFinanceService;
import ru.relex.hotelteam.db.domain.BookingPayment;
import ru.relex.hotelteam.db.mapper.IFinanceMapper;
import ru.relex.hotelteam.dto.date.IntervalDto;
import ru.relex.hotelteam.dto.finance.FinanceIncomeDto;
import ru.relex.hotelteam.mapstruct.IBookingPaymentMapstruct;

/**
 * For representation of finance statistics for income info.
 *
 * @author Tarasov Ivan
 */
@Service
public class FinanceServiceImpl implements IFinanceService {

  private final IFinanceMapper mapper;

  private final IBookingPaymentMapstruct paymentMapstruct;

  public FinanceServiceImpl(IFinanceMapper mapper, IBookingPaymentMapstruct paymentMapstruct) {
    this.mapper = mapper;
    this.paymentMapstruct = paymentMapstruct;
  }

  @Override
  public FinanceIncomeDto getIncome(IntervalDto interval) {

    List<BookingPayment> financeIncomeList = mapper
        .getIncome(interval.getFrom(), interval.getTo());

    BigDecimal income = BigDecimal.ZERO;

    // просуммируем доход
    for (BookingPayment b : financeIncomeList) {
      income = income.add(b.getTotal());
    }

    // составим финасовую информацию
    FinanceIncomeDto financeIncome = new FinanceIncomeDto();

    financeIncome.setIncome(income);
    financeIncome.setPayments(
        financeIncomeList.stream()
            .map(paymentMapstruct::toSmallPaymentDto).collect(Collectors.toList())
    );

    return financeIncome;
  }
}
