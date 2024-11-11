package tostu.dddplayground.user.application;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tostu.dddplayground.user.domain.User;
import tostu.dddplayground.user.domain.UserRepository;

@Service
@RequiredArgsConstructor
public class UserApplicationService {
//    private final ApplicationEventPublisher events;
    private final UserRepository userRepository;

    public User getUserById(User.UserId id) {
        return userRepository.findById(id).orElseThrow();
    }

    public User getUserByUsername(User.UserName username) {
        return userRepository.findByName(username).orElseThrow();
    }
}
