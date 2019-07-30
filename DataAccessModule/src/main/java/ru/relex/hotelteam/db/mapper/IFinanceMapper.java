package ru.relex.hotelteam.db.mapper;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import ru.relex.hotelteam.db.domain.FinanceIncome;

/**
 * For operating(create, update, get, ... ) with finance info through db.
 *
 * @author Tarasov Ivan
 */
public interface IFinanceMapper {

  List<FinanceIncome> getIncome(@Param("from") Date from, @Param("to") Date to);
}
