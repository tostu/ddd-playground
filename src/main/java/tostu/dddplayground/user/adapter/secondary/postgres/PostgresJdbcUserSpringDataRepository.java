package tostu.dddplayground.user.adapter.secondary.postgres;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostgresJdbcUserSpringDataRepository extends CrudRepository<PostgresJdbcUserEntity, Long> {
    Optional<PostgresJdbcUserEntity> findByName(String name);
}
