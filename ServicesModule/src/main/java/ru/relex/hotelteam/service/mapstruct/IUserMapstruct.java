package ru.relex.hotelteam.service.mapstruct;


import java.util.List;
import org.mapstruct.Mapper;
import ru.relex.hotelteam.db.domain.User;
import ru.relex.hotelteam.service.dto.UserDto;
import ru.relex.hotelteam.service.dto.UserUpdateDto;

@Mapper(componentModel = "spring")
public interface IUserMapstruct {

  User fromDto(UserDto dto);

  UserDto toDto(User user);

  UserUpdateDto toUpdateDto(User user);

  User fromUpdateDto(UserUpdateDto userUpdateDTO);

  List<UserDto> toDTO(List<User> users);

  List<User> fromDto(List<UserDto> userSafeDTOS);
}
