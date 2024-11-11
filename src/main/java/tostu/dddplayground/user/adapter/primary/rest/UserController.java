package tostu.dddplayground.user.adapter.primary.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tostu.dddplayground.user.adapter.primary.rest.dto.UserDto;
import tostu.dddplayground.user.application.UserApplicationService;
import tostu.dddplayground.user.domain.User;

@RestController("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserRestMapper mapper;
    private final UserApplicationService service;

    @GetMapping("/{id}")
    UserDto getById(@PathVariable Long id) {
        return mapper.toDto(service.getUserById(new User.UserId(id)));
    }

    @GetMapping("/username/{username}")
    UserDto getById(@PathVariable String username) {
        return mapper.toDto(service.getUserByUsername(new User.UserName(username)));
    }

}
