package ru.relex.hotelteam;

import java.util.List;
import ru.relex.hotelteam.dto.date.IntervalDto;
import ru.relex.hotelteam.dto.finance.FinanceIncomeDto;

/**
 * Service for computing finance statistics.
 *
 * @author Tarasov Ivan
 */
public interface IFinanceService {

  FinanceIncomeDto getIncome(IntervalDto interval);
}
