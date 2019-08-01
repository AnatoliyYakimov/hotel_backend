package ru.relex.hotelteam.web.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.annotation.security.RolesAllowed;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.relex.hotelteam.IFinanceService;
import ru.relex.hotelteam.dto.date.IntervalDto;
import ru.relex.hotelteam.dto.finance.FinanceIncomeDto;

/**
 * Created by Tarasov Ivan.
 */
@RestController
@RequestMapping(path = "/finances",
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class FinanceController {

  final private IFinanceService service;

  public FinanceController(IFinanceService service) {
    this.service = service;
  }

  @GetMapping("/income")
  public FinanceIncomeDto getIncaome(@RequestParam("from") String from,
      @RequestParam("to") String to) throws ParseException {
    IntervalDto interval = new IntervalDto();
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

    interval.setFrom(format.parse(from));
    interval.setTo(format.parse(to));

    return service.getIncome(interval);
  }
}
