package tostu.dddplayground.user.adapter.secondary.postgres;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tostu.dddplayground.user.domain.User;
import tostu.dddplayground.user.domain.UserMapper;

import java.util.Optional;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {UserMapper.class})
public interface PostgresUserMapper {
    User toDomain(PostgresJdbcUserEntity entity);
    PostgresJdbcUserEntity toEntity(User user);
}
