package tostu.dddplayground.user.domain;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    // Mapping methods for UserId
    default Long mapUserIdToLong(User.UserId userId) {
        return userId == null ? null : userId.value();
    }

    default User.UserId mapLongToUserId(Long value) {
        return value == null ? null : new User.UserId(value);
    }

    // Mapping methods for UserName
    default String mapUserNameToString(User.UserName userName) {
        return userName == null ? null : userName.value();
    }

    default User.UserName mapStringToUserName(String value) {
        return value == null ? null : new User.UserName(value);
    }
}
