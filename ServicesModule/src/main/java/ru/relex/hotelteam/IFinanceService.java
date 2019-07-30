package ru.relex.hotelteam;

import java.util.List;
import ru.relex.hotelteam.dto.bookings.BookingPaymentDto;
import ru.relex.hotelteam.dto.date.IntervalDto;

/**
 * Service for computing finance statistics.
 *
 * @author Tarasov Ivan
 */
public interface IFinanceService {

  List<BookingPaymentDto> getIncome(IntervalDto interval);
}
