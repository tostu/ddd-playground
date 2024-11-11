package tostu.dddplayground.user.adapter.secondary.postgres;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import tostu.dddplayground.user.domain.User;
import tostu.dddplayground.user.domain.UserRepository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostgresJdbcUserRepository implements UserRepository {

    private final PostgresUserMapper mapper;
    private final PostgresJdbcUserSpringDataRepository springDataRepository;

    @Override
    public void delete(User user) {
        springDataRepository.delete(mapper.toEntity(user));
    }

    @Override
    public User save(User user) {
        return mapper.toDomain(springDataRepository.save(mapper.toEntity(user)));
    }

    @Override
    public Optional<User> findById(User.UserId id) {
        return springDataRepository.findById(id.value()).map(mapper::toDomain);
    }

    @Override
    public Optional<User> findByName(User.UserName name) {
        return springDataRepository.findByName(name.value()).map(mapper::toDomain);
    }
}
