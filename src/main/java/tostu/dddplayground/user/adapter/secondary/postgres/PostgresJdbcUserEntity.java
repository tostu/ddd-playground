package tostu.dddplayground.user.adapter.secondary.postgres;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
public record PostgresJdbcUserEntity(
        @Id
        Long id,
        String name
) {
}
