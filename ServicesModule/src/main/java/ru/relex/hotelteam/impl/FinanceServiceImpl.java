package ru.relex.hotelteam.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import ru.relex.hotelteam.IFinanceService;
import ru.relex.hotelteam.db.mapper.IFinanceMapper;
import ru.relex.hotelteam.dto.bookings.BookingPaymentDto;
import ru.relex.hotelteam.dto.date.IntervalDto;
import ru.relex.hotelteam.dto.finance.FinanceIncomeDto;
import ru.relex.hotelteam.mapstruct.IFinanceMapstruct;

/**
 * For representation of finance statistics for income info.
 *
 * @author Tarasov Ivan
 */
@Service
public class FinanceServiceImpl implements IFinanceService {

  private final IFinanceMapper mapper;
  private final IFinanceMapstruct mapstruct;

  public FinanceServiceImpl(IFinanceMapper mapper, IFinanceMapstruct mapstruct) {
    this.mapper = mapper;
    this.mapstruct = mapstruct;
  }

  @Override
  public List<FinanceIncomeDto> getIncome(IntervalDto interval) {
    return mapstruct.fromDomain(mapper.getIncome(interval.getFrom(), interval.getTo()));
  }
}
