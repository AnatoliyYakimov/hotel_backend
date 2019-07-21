package ru.relex.hotelteam.service;

import java.util.List;
import ru.relex.hotelteam.service.dto.BookingCreateDto;
import ru.relex.hotelteam.service.dto.BookingDto;
import ru.relex.hotelteam.service.dto.BookingRegisterDto;
import ru.relex.hotelteam.service.dto.BookingUpdateDto;

public interface IBookingService {

  BookingDto createBooking(BookingCreateDto booking);

  BookingDto findById(int id);

  List<BookingDto> listBookings();

  List<BookingDto> listBookingsByUserId(int userId);

  List<BookingDto> listBookingsByRoomId(int roomId);

  void registerGuest(BookingRegisterDto registerDto);

  void delete(int id);

  void update(int id, BookingUpdateDto updatedBooking);
}
