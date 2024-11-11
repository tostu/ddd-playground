package tostu.dddplayground.user.application.query;

import tostu.dddplayground.core.QueryEvent;
import tostu.dddplayground.user.domain.User;

public class GetUserByIdQuery extends QueryEvent {
    User.UserId id;

    public GetUserByIdQuery(Object source, User.UserId id) {
        super(source);
        this.id = id;
    }
}
