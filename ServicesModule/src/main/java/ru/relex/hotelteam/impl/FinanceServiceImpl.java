package ru.relex.hotelteam.impl;

import java.util.List;
import ru.relex.hotelteam.IFinanceService;
import ru.relex.hotelteam.dto.bookings.BookingPaymentDto;
import ru.relex.hotelteam.dto.date.IntervalDto;

/**
 * For representation of finance statistics for income info.
 *
 * @author Tarasov Ivan
 */
public class FinanceServiceImpl implements IFinanceService {

  private final IFinanceMapper mapper;
  private final IFinanceMapstruct mapstruct;

  public FinanceServiceImpl(IFinanceMapper mapper, IFinanceMapstruct mapstruct) {
    this.mapper = mapper;
    this.mapstruct = mapstruct;
  }

  @Override
  public List<BookingPaymentDto> getIncome(IntervalDto interval) {
    return null;
  }
}
