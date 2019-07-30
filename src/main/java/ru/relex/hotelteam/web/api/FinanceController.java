package ru.relex.hotelteam.web.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
