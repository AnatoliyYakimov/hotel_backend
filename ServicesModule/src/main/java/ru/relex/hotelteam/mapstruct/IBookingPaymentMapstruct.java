package ru.relex.hotelteam.mapstruct;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.relex.hotelteam.db.domain.BookingPayment;
import ru.relex.hotelteam.dto.bookings.BookingPaymentDto;
import ru.relex.hotelteam.dto.finance.BookingSmallPaymentDto;

@Mapper(componentModel = "spring")
public interface IBookingPaymentMapstruct {

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "paid", ignore = true)
  BookingPayment fromDto(BookingPaymentDto dto);

  List<BookingPayment> fromDto(List<BookingPaymentDto> dto);

  List<BookingPaymentDto> toDto(List<BookingPayment> payments);

  BookingPaymentDto toDto(BookingPayment payment);

  List<BookingSmallPaymentDto> toSmallPaymentDto(List<BookingPayment> payments);

  BookingSmallPaymentDto toSmallPaymentDto(BookingPayment payment);

}
