package ru.relex.hotelteam.db.mapper;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ru.relex.hotelteam.db.domain.BookingPayment;

@Mapper
public interface IBookingPaymentMapper {

  BookingPayment createPayment(BookingPayment bookingPayment);

  Optional<BookingPayment> getPaymentById(@Param("id") int id);

  List<BookingPayment> listPayments();

  List<BookingPayment> listPaymentsReservationHistoryForUser(int userId);

  List<BookingPayment> listPaymentsByUserId(@Param("userId") int userId);

  BookingPayment getPaymentByBookingId(@Param("bookingId") int bookingId);

  void deletePayment(@Param("id") int id);

  void deletePaymentByBookingId(@Param("bookingId") int bookingId);

  void updatePayment(BookingPayment payment);

  void updatePaymentDateByBookingId(@Param("bookingId") int bookingId
      , @Param("date") LocalDateTime date);

}
