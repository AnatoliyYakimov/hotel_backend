package ru.relex.hotelteam.mapstruct;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.relex.hotelteam.db.domain.FinanceIncome;
import ru.relex.hotelteam.dto.finance.FinanceIncomeDto;

/**
 * Mapper for finance needs.
 *
 * @author Tarasov Ivan
 */
@Mapper(componentModel = "spring" , uses = IBookingPaymentMapstruct.class)
public interface IFinanceMapstruct {

  @Mappings({
      @Mapping(target = "payment.date", source = "date"),
      @Mapping(target = "payment.total", source = "total")
  })
  FinanceIncomeDto fromDomain(FinanceIncome financeIncome);

  FinanceIncome toDomain(FinanceIncomeDto dto);

  List<FinanceIncomeDto> fromDomain(List<FinanceIncome> financeIncomes);

  List<FinanceIncome> toDomain(List<FinanceIncomeDto> financeIncomeDtos);
}
