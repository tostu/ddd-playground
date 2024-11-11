package tostu.dddplayground.user.adapter.primary.rest;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tostu.dddplayground.user.adapter.primary.rest.dto.UserDto;
import tostu.dddplayground.user.domain.User;
import tostu.dddplayground.user.domain.UserMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {UserMapper.class})
public interface UserRestMapper {
    UserDto toDto(User user);
}
