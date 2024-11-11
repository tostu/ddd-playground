package tostu.dddplayground.user.adapter.primary.module;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import tostu.dddplayground.user.domain.UserMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = {UserMapper.class})
public interface UserModuleMapper {
}
