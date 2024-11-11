package tostu.dddplayground.user.domain;

import lombok.Getter;
import lombok.Setter;
import org.jmolecules.architecture.layered.DomainLayer;
import org.jmolecules.ddd.annotation.AggregateRoot;
import org.jmolecules.ddd.annotation.Identity;
import org.jmolecules.ddd.annotation.ValueObject;

@Getter
@Setter
@DomainLayer
@AggregateRoot
public class User {
    @Identity
    UserId id;
    UserName name;

    @ValueObject
    public record UserId(Long value){};

    @ValueObject
    public record UserName(String value){};
}
