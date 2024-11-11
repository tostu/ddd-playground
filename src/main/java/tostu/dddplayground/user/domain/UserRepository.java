package tostu.dddplayground.user.domain;

import java.util.Optional;

public interface UserRepository {
    void delete(User user);
    User save(User user);
    Optional<User> findById(User.UserId id);
    Optional<User> findByName(User.UserName username);
}
